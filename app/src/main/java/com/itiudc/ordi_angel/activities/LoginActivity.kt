package com.itiudc.ordi_angel.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.itiudc.ordi_angel.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val Boton = findViewById<Button>(R.id.boton)
        val InputPassword = findViewById<EditText>(R.id.contrasena)
        val InputEmail = findViewById<EditText>(R.id.email)

        Boton.setOnClickListener() {
            if (InputEmail.text.isEmpty() || InputPassword.text.isEmpty()) {
                Toast.makeText(this, "Llene todo los campos.", Toast.LENGTH_LONG).show()
            }else{
                var Intent: Intent = Intent(applicationContext, MainScreen::class.java)
                startActivity(Intent)
            }
        }
    }
}