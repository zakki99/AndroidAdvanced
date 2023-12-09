package com.example.androidadvanced

import android.content.Intent
import android.media.session.MediaSessionManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity(), View.OnClickListener {


    private lateinit var button: Button
    private lateinit var nama: EditText
    private lateinit var pass: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val txtViewSignIn: Button = findViewById(R.id.btnlogin)
        txtViewSignIn.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnlogin -> {
                val intent = Intent(this@Login, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}