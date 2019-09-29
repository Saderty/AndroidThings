package com.saderty.androidthings;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import static com.saderty.androidthings.FloorActivity.*;

public class DisplayActivity extends AppCompatActivity {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        iv=findViewById(R.id.iv);

        if (floor==1){
            iv.setImageResource(R.drawable.an1);
        }if (floor==2){
            iv.setImageResource(R.drawable.an2);
        }if (floor==3){
            iv.setImageResource(R.drawable.an3);
        }if (floor==4){
            iv.setImageResource(R.drawable.an4);
        }
    }

}
