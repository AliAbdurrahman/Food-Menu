package com.example.alba33.foodmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GongDetail extends AppCompatActivity {

    TextView gDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gong_detail);

        gDetail = (TextView)findViewById(R.id.txtDetailGong);
        gDetail.setText("Gong-gong adalah sejenis siput laut yang diolah dengan cara direbus atau ditumis dengan bumbu-bumbu khusus. Mungkin Anda dapat menjumpai menu makanan ini di berbagai restoran seafood yang ada di Indonesia, tetapi di Batam gong-gong merupakan ikon kuliner yang dapat ditemukan dengan mudah di semua restoran sari laut yang ada di sana.");
    }
}
