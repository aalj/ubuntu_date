package com.example.aday16_defineview;

import android.app.Activity;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

/*
 * imageview的缩放效果:
 * 按钮，imageview
 */

public class ImageViewMatrixActivity extends Activity {

	ImageView iv;
	Matrix matrix;
	float scaleValue=1;//缩放值:原来大小
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_view_matrix);
		iv=(ImageView) findViewById(R.id.imageView1);
		matrix=new Matrix();
	}

	//点击按钮，放大处理
	public void large(View v){
		scaleValue+=0.2;
		matrix.reset();
		matrix.setScale(scaleValue, scaleValue);

		iv.setImageMatrix(matrix);

	}


}