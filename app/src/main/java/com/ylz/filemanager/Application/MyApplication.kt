package com.ylz.filemanager.Application

import android.app.Application
import tech.gujin.toast.ToastUtil

/**
 * @author yulizhou
 * @description:
 * @date :2020/4/17 13:20
 */
class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        ToastUtil.initialize(this)
//        ToastUtil.show("ToastUtil");
//        Or in sub-thread
//        ToastUtil.postShow("ToastUtil");
    }
}