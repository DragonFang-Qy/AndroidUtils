package com.fangzitcl.libs.util;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * @ClassName: UtilSnackbar
 * @PackageName: com.fangzitcl.libs.util
 * @Acthor: Fang_QingYou
 * @Time: 2016.01.03 12:36
 */
public class UtilSnackbar {

    //  请在build.gradle 添加  compile 'com.android.support:design:23.1.1'
    private UtilSnackbar() {
    }

    public static boolean isShow = true; // 全局控制，有利有弊
//    可以写一个基类Activity 定义一个 view ,以下方法能进一步简化成下面这种形式
//     public static void showShort( CharSequence message) {
//    if (isShow)
//           Snackbar.make(BaseActivity.mView, message,  Snackbar.LENGTH_SHORT).show();
//  }

    /**
     * 短时间显示 Snackbar
     *
     * @param view
     * @param message
     */
    public static void showShort(View view, CharSequence message) {
        if (isShow)
            Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show();
    }


    /**
     * 短时间显示 Snackbar
     *
     * @param view
     * @param resid
     */
    public static void showShort(View view, int resid) {
        if (isShow)
            Snackbar.make(view, view.getResources().getString(resid), Snackbar.LENGTH_SHORT).show();
    }

    /**
     * 长时间显示 Snackbar
     *
     * @param view
     * @param message
     */
    public static void showLong(View view, CharSequence message) {
        if (isShow)
            Snackbar.make(view, message, Snackbar.LENGTH_LONG).show();
    }

    /**
     * 长时间显示 Snackbar
     *
     * @param view
     * @param resid
     */
    public static void showLong(View view, int resid) {
        if (isShow)
            Snackbar.make(view, view.getResources().getString(resid), Snackbar.LENGTH_LONG).show();
    }

    /**
     * 自定义显示 Snackbar时间
     *
     * @param view
     * @param message
     * @param duration
     */
    public static void show(View view, CharSequence message, int duration) {
        if (isShow)
            Snackbar.make(view, message, duration).show();
    }

    /**
     * 自定义显示 Snackbar时间
     *
     * @param view
     * @param resid
     * @param duration
     */
    public static void show(View view, int resid, int duration) {
        if (isShow)
            Snackbar.make(view, view.getResources().getString(resid), duration).show();
    }

}
