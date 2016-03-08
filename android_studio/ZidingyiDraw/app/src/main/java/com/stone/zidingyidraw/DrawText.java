package com.stone.zidingyidraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * 自定义VIew 自定义属性
 */
/*

自定义属性，属性名，属性取值雷型
 */
public class DrawText extends View {
    Paint paint = new Paint();
    public DrawText(Context context) {
        super(context);
    }

    public DrawText(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setTextSize(1000);
    }

    public DrawText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        canvas.drawText("abc",500,500, paint);
    }
}
