package com.stone.myview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.stone.zidingyidraw.R;

import butterknife.Bind;

/**
 * Created by stone on 16-3-7.
 */
public class MyTextView extends LinearLayout {
    private ImageView leftIma;
    private TextView title;
    private ImageView reghtIma;
    private View view = null;


    public ImageView getLeftIma() {
        return leftIma;
    }

    public TextView getTitle() {
        return title;
    }

    public ImageView getReghtIma() {
        return reghtIma;
    }



    public MyTextView(Context context) {
        super(context);
        initView();
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.TitleBar);

        int color = array.getColor(R.styleable.TitleBar_Tilte_Color, 0xff00ff00);
        Log.i("TAG", "MyTextView: " + color);
        title.setTextColor(color);


        String titleName = array.getString(R.styleable.TitleBar_TitleBar_Title);
        title.setText(titleName);


        //通过自定义属性得到左边的图片属性值
        Drawable leftDrawable = array.getDrawable(R.styleable.TitleBar_Title_Left_Image);
        if (leftDrawable != null) {
            leftIma.setImageDrawable(leftDrawable);
        }

        //通过自定义属性得到右边的图片属性值
        Drawable reghtDrawable = array.getDrawable(R.styleable.TitleBar_Title_Reght_Image);
        if (reghtDrawable != null) {
            reghtIma.setImageDrawable(reghtDrawable);
        }

    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();


    }
//用于初始化布局的一些控件

    private void initView() {
        view = View.inflate(getContext(), R.layout.myview, this);

        leftIma = (ImageView) view.findViewById(R.id.left_ima);
        title = (TextView) view.findViewById(R.id.title);
        reghtIma = (ImageView) view.findViewById(R.id.reght_ima);

    }


}

