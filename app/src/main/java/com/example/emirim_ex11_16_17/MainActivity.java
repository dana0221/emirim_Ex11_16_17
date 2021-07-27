package com.example.emirim_ex11_16_17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] itemArr = {"조커", "신과 함께", "토이스토리4", "겨울왕국2", "극한직업", "주먹왕 랄프2" ,"걸캅스", "라라랜드", "주토피아", "말레피센트"};
    ImageView imgv;
    int[] posterIds = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("스피너와 영화 포스터");

        imgv = findViewById(R.id.imgv);
        Spinner spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, itemArr);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                imgv.setImageResource(posterIds[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}