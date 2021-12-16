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
//      메모장을 열기만 하면 되니깐 인자가 context밖에 없다. 그대신 결과를 ox로 가져올거야~라는 의미로 : Boolean을 추가해준다.
        fun getAutoLogin(context: Context) : Boolean{

            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
//          원래 getBoolean("AUTO_LOGIN")으로 해야하는데 여기서 오타가 나면 꼬이기 때문에 위에서 선언해준 변수를 대입해준다.
//          처음 앱을 켰을때 디폴트는 뭐야? -> 안누른거~ -> false
            return pref.getBoolean(AUTO_LOGIN, false)



        }

    }

}