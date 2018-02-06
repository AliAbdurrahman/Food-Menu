package com.example.alba33.foodmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GongMasak extends AppCompatActivity {

    TextView gMasak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gong_masak);

        gMasak = (TextView)findViewById(R.id.txtMasak);
        gMasak.setText("diolah dengan cara direbus atau ditumis dengan bumbu-bumbu khusus");
    }
}
