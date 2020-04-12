package com.cuncaojin.mvn_private_repo

import android.content.Context
import android.widget.Toast

class ToastUtil {
    companion object {
        fun show(context: Context, s: String) {
            Toast.makeText(context,"mvn_private_repo: "+ s, Toast.LENGTH_SHORT).show()
        }
    }
}