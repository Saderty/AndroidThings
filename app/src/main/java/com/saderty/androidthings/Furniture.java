package com.saderty.androidthings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;

public class Furniture extends AppCompatActivity {
    CheckBox m1, m2, m3, m4, m5, m6, m7, m8, m9, m10;
    TextView mtv1, mtv2;
    SeekBar t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
    Button img;

    Double[] price = {3900., 1992., 1713., 4654., 7300., 3090., 2250., 706., 1785., 4990.,};
    Double[] p = new Double[price.length];
    //Double res = 0.;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        m1 = findViewById(R.id.m1);
        m2 = findViewById(R.id.m2);
        m3 = findViewById(R.id.m3);
        m4 = findViewById(R.id.m4);
        m5 = findViewById(R.id.m5);
        m6 = findViewById(R.id.m6);
        m7 = findViewById(R.id.m7);
        m8 = findViewById(R.id.m8);
        m9 = findViewById(R.id.m9);
        m10 = findViewById(R.id.m10);

        mtv1 = findViewById(R.id.mtv1);
        mtv2 = findViewById(R.id.mtv2);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        t9 = findViewById(R.id.t9);
        t10 = findViewById(R.id.t10);

        img = findViewById(R.id.btn_img);

        mtv1.setText(FloorActivity.floor);

        if (FloorActivity.floor == 2) {
            m4.setEnabled(false);
            t4.setEnabled(false);
            m5.setEnabled(false);
            t5.setEnabled(false);
        }
        if (FloorActivity.floor == 3) {
            m4.setEnabled(false);
            t4.setEnabled(false);
            m5.setEnabled(false);
            t5.setEnabled(false);
            m8.setEnabled(false);
            t8.setEnabled(false);
            m9.setEnabled(false);
            t9.setEnabled(false);
            m10.setEnabled(false);
            t10.setEnabled(false);
        }
        if (FloorActivity.floor == 4) {
            m4.setEnabled(false);
            t4.setEnabled(false);
            m5.setEnabled(false);
            t5.setEnabled(false);
            m6.setEnabled(false);
            t6.setEnabled(false);
            m7.setEnabled(false);
            t7.setEnabled(false);
            m10.setEnabled(false);
            t10.setEnabled(false);
        }

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Furniture.this, DisplayActivity.class);
                startActivity(intent);
            }
        });

        t1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p[0] = price[0] * t1.getProgress();
                mtv2.setText(getSum());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        t2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p[1] = price[1] * t2.getProgress();
                mtv2.setText(getSum());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        t3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p[2] = price[2] * t3.getProgress();
                mtv2.setText(getSum());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        t4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p[3] = price[3] * t4.getProgress();
                mtv2.setText(getSum());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        t5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p[4] = price[4] * t5.getProgress();
                mtv2.setText(getSum());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        t6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p[5] = price[5] * t6.getProgress();
                mtv2.setText(getSum());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        t7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p[6] = price[6] * t7.getProgress();
                mtv2.setText(getSum());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        t8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p[7] = price[7] * t8.getProgress();
                mtv2.setText(getSum());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        t9.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p[8] = price[8] * t9.getProgress();
                mtv2.setText(getSum());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        t10.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p[9] = price[9] * t10.getProgress();
                mtv2.setText(getSum());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    String getSum() {
        Double sum = 0.;

        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                sum += p[i];
            }
        }
        return sum + "Р";
    }
}
