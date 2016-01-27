package com.example.administrator.meituan.customView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.example.administrator.meituan.R;

/**
 * Created by Administrator on 16-1-27.
 */
public class RoundImage  extends ImageView {

    private int mBorderThinkness = 0;
    private Context mContext;
    private int defaultColor = 0xFFFFFFFF;

    //如果只有其中一个值，则只画一个圆形边框

    private  int mBorderOutSideColor = 0;
    private int mBorderInSideColor = 0;

    //控件默认的长和宽
    private int defaultWidth = 0;
    private int defaultHeight = 0;


    public RoundImage(Context context) {
        super(context);
        mContext = context;
    }

    public RoundImage(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        setCustomAttributes(attrs);
    }

    public RoundImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void setCustomAttributes(AttributeSet attrs) {

        TypedArray a = mContext.obtainStyledAttributes(attrs, R.styleable.roundedimageview);
        mBorderThinkness = a.getDimensionPixelOffset(R.styleable.roundedimageview_border_thickness,0);
        mBorderOutSideColor = a.getCol

    }

}

















