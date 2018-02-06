package com.example.alba33.foodmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuMakanan extends AppCompatActivity {

    GridView Makanan;

    String[] makan = {
            "Gong - Gong", "Luti Gendang", "Mi Lendir", "Mi Sagu", "Mi Tarempa"
    };
    int[] images = {

            R.drawable.gong,
            R.drawable.luti,
            R.drawable.milendir,
            R.drawable.misagu,
            R.drawable.mitarempa,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);


        Makanan = (GridView) findViewById(R.id.gv_Makanan);

        GridAdapter gridAdapter = new GridAdapter();
        Makanan.setAdapter(gridAdapter);

        Makanan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0 ) {
                    Intent a1 = new Intent(getApplicationContext(), DetailMakanan.class);
                    startActivity(a1);
                } else if (position == 1) {
                    Intent a2 = new Intent(getApplicationContext(), DetailMakanan.class);
                    startActivity(a2);
                } else if (position == 2) {
                    Intent a3 = new Intent(getApplicationContext(), DetailMakanan.class);
                    startActivity(a3);
                } else if (position == 3) {
                    Intent a4 = new Intent(getApplicationContext(), DetailMakanan.class);
                    startActivity(a4);
                } else if (position == 4) {
                    Intent a5 = new Intent(getApplicationContext(), DetailMakanan.class);
                    startActivity(a5);
                }
            }
        });
    }

    class GridAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
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
            View view = getLayoutInflater().inflate(R.layout.griditem, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.imageview);
            TextView mTextView = (TextView) view.findViewById(R.id.textview);

            mImageView.setImageResource(images[Position]);
            mTextView.setText(makan[Position]);

            return view;
        }
}}
