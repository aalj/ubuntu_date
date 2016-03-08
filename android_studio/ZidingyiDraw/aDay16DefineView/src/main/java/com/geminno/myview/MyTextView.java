package com.geminno.myview;

import com.example.aday16_defineview.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/*
 * 绘制文本
 * 读取xml文件的取值；
 * 应用在view
 */

public class MyTextView extends View {

	Paint paint;

	@SuppressLint("Recycle")
	public MyTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub

		Log.i("MyDefineView", " MyTextView");
		//获取属性取值
		TypedArray arrays=context.obtainStyledAttributes(attrs,R.styleable.mytextview);

		int color=arrays.getColor(R.styleable.mytextview_mytextcolor, Color.RED);
		float f=arrays.getDimension(R.styleable.mytextview_mytextsize, 100);

		arrays.recycle();
		paint=new Paint();
		//应用属性取值
		paint.setColor(color);
		paint.setTextSize(f);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub

		Log.i("MyDefineView", "onDraw");
		super.onDraw(canvas);
		canvas.drawText("abc", 100, 100, paint);
	}



}