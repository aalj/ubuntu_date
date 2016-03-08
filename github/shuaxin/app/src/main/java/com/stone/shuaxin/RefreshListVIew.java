package com.stone.shuaxin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/**
 * Created by stone on 16-3-8.
 */
public class RefreshListVIew extends ListView {
    public RefreshListVIew(Context context) {
        super(context);
    }

    public RefreshListVIew(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RefreshListVIew(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private  void addHead(){
        View.inflate(getContext(),R.layout.head_listview,this);
    }


}
