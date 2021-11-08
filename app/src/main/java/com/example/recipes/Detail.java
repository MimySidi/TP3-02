package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    private TextView t1;
    private TextView t2;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.txt2);
        img=findViewById(R.id.img);

        Intent intent = getIntent();
        String message = intent.getStringExtra("nom");

        switch(message){
            case ("Iconic Plate: Bistecca alla Fiorentina"):
                t1.setText(getString(R.string.ing1));
                t2.setText(getString(R.string.pro1));
                img.setImageResource(R.drawable.img1);
                break;
            case ("Strawberry custard creams"):
                t1.setText(getString(R.string.ing2));
                t2.setText(getString(R.string.pro2));
                img.setImageResource(R.drawable.img2);
                break;
            case ("Almond blancmange with blackcurrant sauce"):
                t1.setText(getString(R.string.ing3));
                t2.setText(getString(R.string.pro3));
                img.setImageResource(R.drawable.img3);
                break;
            case ("Tex-Mex inspired cheeseburger"):
                t1.setText(getString(R.string.ing4));
                t2.setText(getString(R.string.pro4));
                img.setImageResource(R.drawable.img4);
                break;
            default:
                // Do nothing
        }

    }
}