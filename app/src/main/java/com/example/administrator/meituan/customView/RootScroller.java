package com.example.administrator.meituan.customView;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.example.administrator.meituan.Utils.DisplayUtil;

/**
 * Created by Administrator on 16-1-27.
 */
public class RootScroller extends ScrollView implements ViewTreeObserver.OnGlobalLayoutListener {


    private int screenHeight;
    private Context mContext;

    //带图片的整体view
    private View  imageView;

    private View titleView;
    private int ViewPagerHeight;


    public void setTitleView(View titleView){

        this.titleView = titleView;
    }

    private boolean isOne;

    private float progressApha;

    public RootScroller(Context context) {
        super(context);
    }

    public RootScroller(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RootScroller(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        WindowManager w = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = w.getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        screenHeight = point.y;
        this.mContext = context;

        //重定义viewpager的高度，因为scrollView嵌套viewpager,viewpager的高度为0；
        getViewTreeObserver().addOnGlobalLayoutListener(this);

    }


    @Override
    public void onGlobalLayout() {

        if(!isOne){
            ViewGroup v = (ViewGroup)getChildAt(0);
            View v1 = v.getChildAt(2);

            android.widget.LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) v1.getLayoutParams();
                                      params.height = screenHeight - v.getChildAt(0).getHeight()
                                                      - v.getChildAt(1).getHeight()
                                                      + DisplayUtil.dip2px(mContext,40);

            v1.setLayoutParams(params);
            //初始位置确定
            isOne = true;
        }
    }
}

















