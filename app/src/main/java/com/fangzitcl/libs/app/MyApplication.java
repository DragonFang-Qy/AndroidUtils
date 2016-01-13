package com.fangzitcl.libs.app;

import android.app.Application;

/**
 * class_name: MyApplication
 * package_name: com.fangzitcl.libs.app
 * acthor: Fang_QingYou
 * time: 15/12/30 上午10:45
 */
public class MyApplication extends Application {

    private MyApplication mApplication;

    @Override
    public void onCreate() {
        super.onCreate();


    }

    public MyApplication getmApplication() {
        return mApplication;
    }
}
