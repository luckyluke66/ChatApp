package com.example.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {

    private lateinit var emailEntry: EditText
    private lateinit var passwordEntry: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnSignup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        emailEntry = findViewById(R.id.emailEntry)
        passwordEntry = findViewById(R.id.passwordEntry)
        btnLogin = findViewById(R.id.btnlogin)
        btnSignup = findViewById(R.id.btnsignup)

        btnSignup.setOnClickListener{
            val intent = Intent(this,Signup::class.java)
            startActivity(intent)
        }
    }
}