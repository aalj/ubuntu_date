package com.stone.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.stone.zidingyidraw.R;

/**
 * Created by stone on 16-3-7.
 */
public class DrawCircle extends View{
    public DrawCircle(Context context) {
        super(context);
        initView();
    }


    public DrawCircle(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public DrawCircle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }
/*
在自定义VIew里面
 */
    Paint paint = new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //参数一、绘图的x轴坐标
        //参数二、绘图的y轴坐标
        //参数三、绘制的圆形半径
        //参数四、绘制图形使用的画笔
        canvas.drawCircle(100,100,100,paint);




    }

    /**
     * 页面初始化方法
     */
    private void initView() {
        paint.setColor(getResources().getColor(R.color.circle));


    }

}
