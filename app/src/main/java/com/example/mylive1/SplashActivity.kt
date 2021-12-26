package com.example.mylive1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        moveTOLoginActivity()
    }
    //use this for late translate
    private fun moveTOLoginActivity(){
        //Delayed code and finish

        Handler(Looper.myLooper()!!).postDelayed({

            finish()// وعمل فنش حتى لا سعود الى الصفحه السابقه

            val i = Intent(this,LoginActivity::class.java)
            startActivity(i)
             },3000)

    }
}