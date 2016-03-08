package com.stone.zidingyidraw;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.stone.myview.MyTextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TitleActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
//        MyTextView viewById = (MyTextView)findViewById(R.id.view2);
//        viewById.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplication(),"dinaji",Toast.LENGTH_SHORT).show();
//            }
//        });
//        viewById.getLeftIma().setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplication(),"zuobian tupian ",Toast.LENGTH_SHORT).show();
//            }
//        });

    }

}
