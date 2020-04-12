package com.cuncaojin.my_android_lib

import android.content.Context
import android.widget.Toast

class ToastUtil {
    companion object {
        fun show(context: Context, s: String) {
            Toast.makeText(context,"my_android_lib: "+ s, Toast.LENGTH_SHORT).show()
        }
    }
}