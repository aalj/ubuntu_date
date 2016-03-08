package com.stone.zidingyidraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by stone on 16-3-7.
 */
public class Draw extends View {
    public Draw(Context context) {

        super(context);
    }

    public Draw(Context context, AttributeSet attrs) {

        super(context, attrs);
        paint.setColor(getResources().getColor(R.color.colorAccent));
    }

    public Draw(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //参数 参数一、图形放置的位置的x轴位置
        //参数二、图形放置位置的y轴位置
        //参数三、图形的圆形的半径，
        //参数四、画笔用于绘图使用
        canvas.drawCircle(100, 100, 100, paint);
    }
}
