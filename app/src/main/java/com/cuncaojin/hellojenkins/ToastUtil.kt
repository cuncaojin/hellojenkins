package com.cuncaojin.hellojenkins

import android.content.Context
import android.widget.Toast

class ToastUtil {
    companion object {
        fun show(context: Context, s: String) {
            Toast.makeText(context,"app: "+ s, Toast.LENGTH_SHORT).show()
        }
    }
}