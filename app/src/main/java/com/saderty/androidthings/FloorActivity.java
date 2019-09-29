package com.saderty.androidthings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class FloorActivity extends AppCompatActivity {
    CheckBox cb11, cb12, cb13, cb21, cb22, cb23, cb24;
    Button floorBtn;

    static String floor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floor);

        cb11 = findViewById(R.id.cb11);
        cb12 = findViewById(R.id.cb12);
        cb13 = findViewById(R.id.cb13);
        cb21 = findViewById(R.id.cb21);
        cb22 = findViewById(R.id.cb22);
        cb23 = findViewById(R.id.cb23);
        cb24 = findViewById(R.id.cb24);

        floorBtn = findViewById(R.id.floorBtn);

        floorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb21.isChecked())floor=cb21.getText().toString();
                if (cb22.isChecked())floor=cb22.getText().toString();
                if (cb23.isChecked())floor=cb23.getText().toString();
                if (cb24.isChecked())floor=cb24.getText().toString();

                Intent intent = new Intent(FloorActivity.this, Furniture.class);
                startActivity(intent);
            }
        });
    }
}
