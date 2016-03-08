package com.stone.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

import com.stone.zidingyidraw.R;

/**
 * Created by stone on 16-3-7.
 */
public class DrawZhixian extends View {
    public DrawZhixian(Context context) {
        super(context);
    }

    public DrawZhixian(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawZhixian(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(getResources().getColor(R.color.greed));

        paint.setStrokeWidth(10f);
        canvas.drawLine(100, 100, 200, 200, paint);
    }
}
