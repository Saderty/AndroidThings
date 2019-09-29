package com.saderty.androidthings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
/*
    @author Saderty
 */
public class MainActivity extends AppCompatActivity {
    EditText regLogin, regPas;
    Button regButton, floorButton;
    SurfaceView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        regButton = findViewById(R.id.reg_btn);

        regLogin = findViewById(R.id.reg_login);
        regPas = findViewById(R.id.reg_pas);

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FloorActivity.class);
                startActivity(intent);
            }
        });
    }

}
