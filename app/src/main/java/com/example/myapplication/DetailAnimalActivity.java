package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailAnimalActivity extends AppCompatActivity {

    TextView name;
    TextView color;
    TextView desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_animal);

        name = findViewById(R.id.txt_name);
        color= findViewById(R.id.txt_color);
        desc = findViewById(R.id.txt_description);

        Intent intent = getIntent();

        String data1 = intent.getStringExtra("name");
        String data2 = intent.getStringExtra("color");
        String data3 = intent.getStringExtra("desc");

        name.setText(data1);
        color.setText(data2);
        desc.setText(data3);
    }
}
