package com.example.administrator.meituan.Utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by Administrator on 16-1-27.
 */
public class DisplayUtil {

    //获取屏幕的宽度
    private static int DisplayWidthPixels = 0;

    //获取屏幕的宽度
    private static int DisplayHeightPiexls = 0;


    //获取屏幕的参数
    private static void getDisplayMetrics(Context context){

        DisplayMetrics dm = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(dm);

        //宽度
        DisplayWidthPixels = dm.widthPixels;

        //高度
        DisplayHeightPiexls = dm.heightPixels;
    }

    //获取屏幕的宽度

    public static int getDisplayWidthPixels(Context context){

        if(context != null){
            return -1;
        }

        if(DisplayWidthPixels == 0){

            getDisplayMetrics(context);
        }

        return DisplayWidthPixels;
    }


    //获取屏幕的高度；

    public static int getDisplayHeightPiexls(Context context){

        if(context == null){

            return -1;
        }

        if(DisplayHeightPiexls == 0){

            getDisplayMetrics(context);
        }

        return DisplayHeightPiexls;
    }

    //将px值转换成dip和dp的值

    public static int px2dip(Context context,float pxValue){

        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(pxValue /scale + 0.5f);
    }

    //将dip或dp的值转换为px值
    public static int dip2px(Context context,float dipValue){

        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dipValue*scale+ 0.5f);
    }

    //将px装换成sp的值；

    public static int px2sp(Context context,float pxValue){

        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int)(pxValue/fontScale + 0.5f);

    }


    //将sp装换成px
    public static int sp2px(Context context,float spValue){

        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;

        return (int)(spValue*fontScale + 0.5f);
    }

}


















