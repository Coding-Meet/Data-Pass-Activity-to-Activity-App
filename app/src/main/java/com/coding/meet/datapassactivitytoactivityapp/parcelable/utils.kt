package com.coding.meet.datapassactivitytoactivityapp.parcelable

import android.app.Activity
import android.os.Build
import android.os.Parcelable


fun <T: Parcelable> Activity.getParcelable(name:String,clazz: Class<T>): T {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        intent.getParcelableExtra(name, clazz)!!
    }else{
        intent.getParcelableExtra(name)!!
    }
}