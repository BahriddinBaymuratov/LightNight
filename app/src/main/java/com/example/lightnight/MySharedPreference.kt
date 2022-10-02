package com.example.lightnight

import android.content.Context
import android.content.SharedPreferences

class MySharedPreference(context: Context) {
    private val MySharedPreference: SharedPreferences = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)

    fun saveTheme(isDark : Boolean){
        val edit = MySharedPreference.edit()
        edit.putBoolean("isDark",isDark)
        edit.apply()
    }
    fun getTheme(): Boolean {
        return MySharedPreference.getBoolean("isDark", false)
    }
    fun clear(){
        val edit = MySharedPreference.edit()
        edit.clear()
        edit.apply()
    }
}
