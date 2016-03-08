package com.example.aday16_defineview;

import android.app.Activity;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

/*
 * imageview������Ч��:
 * ��ť��imageview
 */

public class ImageViewMatrixActivity extends Activity {

	ImageView iv;
	Matrix matrix;
	float scaleValue=1;//����ֵ:ԭ����С
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_view_matrix);
		iv=(ImageView) findViewById(R.id.imageView1);
		matrix=new Matrix();
	}
	
	//�����ť���Ŵ���
	public void large(View v){
		scaleValue+=0.2;
		matrix.reset();
		matrix.setScale(scaleValue, scaleValue);
		
		iv.setImageMatrix(matrix);
		
	}

	
}
