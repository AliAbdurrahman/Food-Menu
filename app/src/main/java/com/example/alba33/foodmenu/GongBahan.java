package com.example.alba33.foodmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GongBahan extends AppCompatActivity {

    TextView gBahan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gong_bahan);

        gBahan = (TextView)findViewById(R.id.txtBahan);
        gBahan.setText("Gong-gong adalah sejenis siput laut");
    }
}
