package com.example.lpf.logmodule.log;

import android.util.Log;

/**
 * Created by lpf on 2017/4/20.
 * 自定的日志打印体系
 */
public class LogF {
    /*定义日志文件最大值*/
    private static final long LOG_FILE_SIZE_MAX = 5 * 1024 * 1024;
    /*定义日志文件最大的个数*/
    private static final int LOG_FILE_SUM_MAX = 10;
    /*控制日志文件是否进行加密操作*/
    public final static boolean ENTRYCODE = true;
    /*是否是debug模式*/
    private static boolean DEBUG = true;
    /*日志打印tag*/
    private static final String TAG = "LogF";
    /*定义日志打印级别*/
    private static final String LEVEL_D = "D";
    private static final String LEVEL_W = "W";
    private static final String LEVEL_E = "E";


    public static void setDebug(boolean d) {
        DEBUG = d;
    }

    public static boolean isDebug() {
        return DEBUG;
    }

    public static int v(String tag,String msg){
        if(msg==null){
            msg="null";
        }
        return Log.v(tag,msg);
    }

    public static int v(String tag, String msg, Throwable tr) {
        if (msg == null) {
            msg = "null";
        }
        return Log.v(tag, msg, tr);
    }


    public static int i(String tag, String msg) {
        if (msg == null) {
            msg = "null";
        }
        return Log.i(tag, msg);

    }



    public static int w(String tag,String msg){
        if(msg==null){
            msg="null";
        }
        return Log.w(tag,msg);
    }

    public  static int e(String tag,String msg){
        if (msg==null){
            msg="null";
        }
        return Log.e(tag,msg);
    }


}
