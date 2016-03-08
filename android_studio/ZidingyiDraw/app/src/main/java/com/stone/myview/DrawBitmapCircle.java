package com.stone.myview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.stone.zidingyidraw.R;

/**
 * Created by stone on 16-3-7.
 */
public class DrawBitmapCircle extends View {
    public DrawBitmapCircle(Context context) {
        super(context);
        paint.setColor(getResources().getColor(R.color.circle));
    }

    public DrawBitmapCircle(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public DrawBitmapCircle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint.setColor(getResources().getColor(R.color.circle));
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        Canvas canvas1 = new Canvas();
//        Bitmap bitmap = Bitmap.createBitmap(400, 800, Bitmap.Config.ARGB_8888);
//        canvas1.setBitmap(bitmap);
//        canvas1.drawCircle(100, 100, 100, paint);
        //在系统提供的canvas没有提供setBitmap方法，通过新建一个Canvar来达到绘图效果
//        canvas.drawBitmap(bitmap, 100, 100, paint);


        Canvas canvas1 = new Canvas();
        Bitmap bitmap = Bitmap.createBitmap(400, 800, Bitmap.Config.ARGB_8888);

        canvas1.setBitmap(bitmap);
        paint.setColor(getResources().getColor(R.color.circle));
        canvas1.drawCircle(100, 100, 100, paint);

        canvas.drawBitmap(bitmap, 100, 100, paint);


    }
}
