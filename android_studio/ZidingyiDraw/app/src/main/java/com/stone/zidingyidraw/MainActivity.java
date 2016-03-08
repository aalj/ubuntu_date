package com.stone.zidingyidraw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/*
绘制一个圆
绘制结果放到bitmap
imageview缩放
绘制圆，加上缩放效果
 */
public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



}
