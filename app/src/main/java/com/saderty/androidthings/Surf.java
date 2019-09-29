package com.saderty.androidthings;

import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.Window;

public class Surf extends AppCompatActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new MySurfaceView(this));
    }

    class MySurfaceView extends SurfaceView {

        Path path;

        Thread thread = null;
        SurfaceHolder surfaceHolder;
        volatile boolean running = false;

        private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        Random random;

        public MySurfaceView(Context context) {
            super(context);
            surfaceHolder = getHolder();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(3);
            paint.setColor(Color.WHITE);
        }

        boolean goneFlag = false;

        int x;
        int y;

        //Put this into the class
        final Handler handler = new Handler();
        Runnable mLongPressed = new Runnable() {
            public void run() {
                goneFlag = true;
                //Code for long click
                Canvas canvas = surfaceHolder.lockCanvas();
                paint.setColor(Color.GREEN);
                canvas.drawRect(x, y, x + 200, y + 200, paint);

                surfaceHolder.unlockCanvasAndPost(canvas);
            }
        };

        @Override
        public boolean onTouchEvent(MotionEvent event) {

            /*if (event.getAction() == MotionEvent.ACTION_DOWN) {
                path = new Path();
                path.moveTo(event.getX(), event.getY());
            } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                path.lineTo(event.getX(), event.getY());
            } else if (event.getAction() == MotionEvent.ACTION_UP) {
                path.lineTo(event.getX(), event.getY());
            }*/

            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                x = (int) event.getX();
                y = (int) getY();
                handler.postDelayed(mLongPressed, 1000);
            }
            if (event.getAction() == MotionEvent.ACTION_MOVE) {
                handler.removeCallbacks(mLongPressed);
            }
            if (event.getAction() == MotionEvent.ACTION_UP) {
                handler.removeCallbacks(mLongPressed);
            }

           /* if (path != null) {
                Canvas canvas = surfaceHolder.lockCanvas();
                canvas.drawPath(path, paint);
                surfaceHolder.unlockCanvasAndPost(canvas);
            }*/


            return true;
        }
    }
}
