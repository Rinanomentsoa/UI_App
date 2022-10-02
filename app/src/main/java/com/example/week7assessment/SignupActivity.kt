package com.example.week7assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }
    fun signup(view: View){
        val intent= Intent(this,WelcomeActivity:: class.java)
        startActivity(intent)}
    fun signin(view: View){
        val intent= Intent(this,SigninActivity:: class.java)
        startActivity(intent)}
}