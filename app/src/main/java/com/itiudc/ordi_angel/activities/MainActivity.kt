package com.itiudc.ordi_angel.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itiudc.ordi_angel.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)

        setTheme(R.style.SplashTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Intent: Intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(Intent)
    }
}