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

	//ϵͳ�ṩ��canvas,��������bitmap(���ƵĽ������bitmap);�Լ������canvas,���Ƶ�bitmap����ʾ������
	
	public void changeView(float scaleValue){
		this.scaleValue=scaleValue;
		
		invalidate();//���߳��н����ػ棺����ondraw
		
		//postInvalidate(); //���߳��н����ػأ�
	}
	
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		//demo2:
		
		/*Bitmap bitmap=Bitmap.createBitmap(480, 800,
		         Bitmap.Config.ARGB_8888);
		
		//����canvas���ݻ�����bitmap�ϣ�ϵͳ�ṩ��canvasû��setbitmap��
		//canvas.setBitmap(bitmap);
		
		//�Լ�����canvas:circle������bitmap�ϣ�
		//Canvas canvas2=new Canvas(bitmap);
		  Canvas canvas2=new Canvas();
		  canvas2.setBitmap(bitmap);
		
		 //�Լ�������canvas���޷�ֱ�ӻ����ڽ�����(Բ�Ѿ����Ƶ�bitmap)
		  canvas2.drawCircle(100, 100, 100, paint);
		  
		  //����bitmap��ϵͳ�ṩ��canvas�����ܻ����ڽ�����
		  canvas.drawBitmap(bitmap, 0, 0, paint);
		*/
		
		//demo4:
		Log.i("MyDefineView", "ondraw");
		
		matrix.reset();
		//����ͼƬ����ֵ 
		matrix.setScale(scaleValue,scaleValue);
		
	
		
		  Bitmap bitmap=Bitmap.createBitmap(480, 800,
		         Bitmap.Config.ARGB_8888);
	
		
		 //�Զ����canvas����Բ����bitmap��
		  Canvas canvas2=new Canvas();
		  canvas2.setBitmap(bitmap);
		  canvas2.drawCircle(100, 100, 100, paint);

		  canvas.drawBitmap(bitmap, matrix, paint);

	}
	
	
	

}
