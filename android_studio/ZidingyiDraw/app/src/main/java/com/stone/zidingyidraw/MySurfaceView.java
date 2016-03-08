package com.stone.zidingyidraw;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by stone on 16-3-7.
 */
public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    public MySurfaceView(Context context) {
        super(context);
        SurfaceHolder holder = getHolder();
        holder.addCallback(this);
    }


    public MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d("TAG", "MySurfaceView: ");
    }

    public MySurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        Log.i("TAG","surfaceCreated");

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        Log.i("TAG","surfaceChanged");
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        Log.i("TAG","surfaceDestroyed");
    }
}
