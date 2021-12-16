package com.example.sharedpreftest_jaewhi.utils

import android.content.Context

class ContextUtil {

    companion object{
//      pref = 메모장 이라고 생각하자.
        private val prefName = "TestPref"

        private val AUTO_LOGIN = "AUTO_LOGIN"

        fun setAutoLogin(context: Context, autoLogin: Boolean){
//      context에 메모장 좀 열어줘. 여기서만 열거 -> Context.MODE_PRIVATE
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
//      pref에 autoLogin의 유무에 따라 Boolean값을 AUTO_LOGIN 변수에 넣어주고 저장(.apply())할래~
            pref.edit().putBoolean(AUTO_LOGIN, autoLogin).apply()

        }

    }

}