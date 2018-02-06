package com.example.alba33.foodmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {

    ListView Detail;

    int[] image = {
            R.drawable.details2 ,
            R.drawable.recipe2,
            R.drawable.cooking2
            };
    String[] Name = {
            "Detail Makanan", "Bahan - Bahan Makanan", "Cara Memasak"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        Detail = (ListView)findViewById(R.id.lv_Detail);

        CustomAdaptor customAdaptor = new CustomAdaptor();
        Detail.setAdapter(customAdaptor);

        Detail.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0 ) {
                    Intent a1 = new Intent(getApplicationContext(), GongDetail.class);
                    startActivity(a1);
                } else if (position == 1) {
                    Intent a2 = new Intent(getApplicationContext(), GongBahan.class);
                    startActivity(a2);
                } else if (position == 2) {
                    Intent a3 = new Intent(getApplicationContext(), GongMasak.class);
                    startActivity(a3);
                }
            }
        });
    }

    class CustomAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int Position, View convertView, ViewGroup viewGroup) {

            View view = getLayoutInflater().inflate(R.layout.listitem, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.imageView);
            TextView mTextView = (TextView) view.findViewById(R.id.textView);

            mImageView.setImageResource(image[Position]);
            mTextView.setText(Name[Position]);

            return view;
        }
    }
}
