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

	

	Paint paint=new Paint();//����

   //�����д���view����
	public CircleView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		Log.i("MyDefineView", "һ�����췽��");
		//ϵͳ�ṩ����ɫ
		//paint.setColor(Color.RED);
		//�Լ�������ɫ
		paint.setColor( getResources().getColor(R.color.red));
	}
	
	   //xml�ļ���ʹ��circleview��
		public CircleView(Context context, AttributeSet attrs) {
	         super(context, attrs);
	 
	         Log.i("MyDefineView", "�������췽��");
	        // paint.setColor(Color.RED);
	         paint.setColor( getResources().getColor(R.color.red));
        }

	
	//�������췽������
	public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
		 Log.i("MyDefineView", "�������췽��");
		// paint.setColor(Color.RED);
		 paint.setColor( getResources().getColor(R.color.red));
	}

	//����ͼ��
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		canvas.drawCircle(100, 100, 100, paint);
		
		//canvas.drawb
	}
	
	
	

}
