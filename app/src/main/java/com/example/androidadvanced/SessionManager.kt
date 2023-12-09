package com.example.androidadvanced

import android.content.Context
import android.content.SharedPreferences

class SessionManager(context: Context) {

    var sharedPreferences:SharedPreferences?=null
    var editor:SharedPreferences.Editor?=null

//    var key
    val keyPreferences = "Login"
    val keyName="Username"
    val keyPassword="Password"

    init {
        sharedPreferences=context.getSharedPreferences(keyPreferences,Context.MODE_PRIVATE)
        editor=sharedPreferences?.edit()
    }

    fun sessionLogin(name: String, pass: String){
        editor?.putString(keyName,name)
        editor?.putString(keyPassword,pass)
        editor?.apply()
    }

    fun sessionLogout(){
        editor?.remove(keyName)
        editor?.remove(keyPassword)
        editor?.apply()
    }




}