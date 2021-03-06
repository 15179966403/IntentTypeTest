package com.hrc.administrator.intenttypetest;

import android.util.Log;

/**
 * 一个可以控制的显示Log的工具
 * 可以通过设置LEVEL的值来控制打印的Log类型
 * 只有当LEVEL的级别小于或等于对应日志级别的值时，才将日志打印出来
 * 将LEVEL的值设为NOTHING时，将不会打印出日志
 * 发布程序时不需要讲Log一行行删除或注释了
 */

public class LogUtil {
    public static final int VERBOSE=1;
    public static final int DEBUG=2;
    public static final int INFO=3;
    public static final int WARN=4;
    public static final int ERROR=5;
    public static final int NOTHING=6;
    public static final int LEVEL=VERBOSE;

    public static void v(String tag,String msg){
        if(LEVEL<=VERBOSE){
            Log.v(tag,msg);
        }
    }

    public static void d(String tag,String msg){
        if (LEVEL<=DEBUG)
            Log.d(tag,msg);
    }

    public static void i(String tag,String msg){
        if (LEVEL<=INFO)
            Log.i(tag,msg);
    }

    public static void w(String tag,String msg){
        if (LEVEL<=WARN)
            Log.w(tag,msg);
    }

    public static void e(String tag,String msg){
        if (LEVEL<=ERROR)
            Log.e(tag,msg);
    }
}
