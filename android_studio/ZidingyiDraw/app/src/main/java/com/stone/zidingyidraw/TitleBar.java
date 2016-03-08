package com.stone.zidingyidraw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by stone on 16-3-7.
 */
public class TitleBar extends LinearLayout {
    public TitleBar(Context context) {
        super(context);
        initView();
    }


    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public TitleBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    TextView title;
    ImageView left_ima;
    ImageView reght_ima;

    /**
     * 页面初始化
     */
    private void initView() {
        View view = View.inflate(getContext(), R.layout.titlebar, this);
        title = (TextView) view.findViewById(R.id.title);
        left_ima = (ImageView) view.findViewById(R.id.left_ima);
        reght_ima = (ImageView) view.findViewById(R.id.reght_ima);
    }

}
