package com.geminno.myview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class DrawBitmapView extends View {

	Paint paint=new Paint();
	Matrix matrix=new Matrix();
	float scaleValue=1;
	public DrawBitmapView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		paint.setColor(Color.RED);
	}

	//系统提供的canvas,不能设置bitmap(绘制的结果放在bitmap);自己定义的canvas,绘制到bitmap，显示不出来

	public void changeView(float scaleValue){
		this.scaleValue=scaleValue;

		invalidate();//主线程中界面重绘：调用ondraw

		//postInvalidate(); //子线程中界面重回：
	}


	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);

		//demo2:

		/*Bitmap bitmap=Bitmap.createBitmap(480, 800,
		         Bitmap.Config.ARGB_8888);

		//错误：canvas内容绘制在bitmap上（系统提供的canvas没有setbitmap）
		//canvas.setBitmap(bitmap);

		//自己创建canvas:circle绘制在bitmap上；
		//Canvas canvas2=new Canvas(bitmap);
		  Canvas canvas2=new Canvas();
		  canvas2.setBitmap(bitmap);

		 //自己创建的canvas，无法直接绘制在界面上(圆已经绘制到bitmap)
		  canvas2.drawCircle(100, 100, 100, paint);

		  //绘制bitmap：系统提供的canvas，才能绘制在界面上
		  canvas.drawBitmap(bitmap, 0, 0, paint);
		*/

		//demo4:
		Log.i("MyDefineView", "ondraw");

		matrix.reset();
		//设置图片缩放值
		matrix.setScale(scaleValue,scaleValue);



		Bitmap bitmap=Bitmap.createBitmap(480, 800,
				Bitmap.Config.ARGB_8888);


		//自定义的canvas，将圆画在bitmap上
		Canvas canvas2=new Canvas();
		canvas2.setBitmap(bitmap);
		canvas2.drawCircle(100, 100, 100, paint);

		canvas.drawBitmap(bitmap, matrix, paint);

	}




}