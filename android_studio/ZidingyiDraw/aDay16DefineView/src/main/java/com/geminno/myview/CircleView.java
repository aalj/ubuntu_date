package com.geminno.myview;

import com.example.aday16_defineview.R;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

//com.geminno.myview.CircleView
public class CircleView extends View {



	Paint paint=new Paint();//画笔

	//代码中创建view对象
	public CircleView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		Log.i("MyDefineView", "一个构造方法");
		//系统提供的颜色
		//paint.setColor(Color.RED);
		//自己定义颜色
		paint.setColor( getResources().getColor(R.color.red));
	}

	//xml文件中使用circleview；
	public CircleView(Context context, AttributeSet attrs) {
		super(context, attrs);

		Log.i("MyDefineView", "两个构造方法");
		// paint.setColor(Color.RED);
		paint.setColor( getResources().getColor(R.color.red));
	}


	//其他构造方法调用
	public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
		Log.i("MyDefineView", "三个构造方法");
		// paint.setColor(Color.RED);
		paint.setColor( getResources().getColor(R.color.red));
	}

	//绘制图形

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		canvas.drawCircle(100, 100, 100, paint);

		//canvas.drawb
	}




}