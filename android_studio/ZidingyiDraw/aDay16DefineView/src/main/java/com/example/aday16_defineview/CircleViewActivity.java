package com.example.aday16_defineview;

import com.geminno.myview.DrawBitmapView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CircleViewActivity extends Activity {

	DrawBitmapView dbv;
	float scaleValue=1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_circle_view);
		dbv=(DrawBitmapView) findViewById(R.id.drawBitmapView1);
	}

	//“放大”按钮
	public void large(View v){
		scaleValue+=0.1;
		dbv.changeView(scaleValue);
	}

}