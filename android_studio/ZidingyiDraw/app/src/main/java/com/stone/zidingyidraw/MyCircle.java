package com.stone.zidingyidraw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
class MyCircle extends View {
    public MyCircle(Context context) {
        super(context);
    }

    public MyCircle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCircle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();


    //任务通过子线程使绘制的圆形不断的变换颜色

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Canvas canvas1 = new Canvas();
        Bitmap bitmap = Bitmap.createBitmap(400, 800, Bitmap.Config.ARGB_8888);
        canvas1.setBitmap(bitmap);
        canvas1.drawCircle(100, 100, 100, paint);
        //在系统提供的canvas没有提供setBitmap方法，通过新建一个Canvar来达到绘图效果
        canvas.drawBitmap(bitmap, 100, 100, paint);



    }
}
