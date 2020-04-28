package com.android.gsixacademy.onlinezadaci1304

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var mySharedPreferences = getSharedPreferences("KotlinBasicTutorialPreferences", Context.MODE_PRIVATE)

        if(mySharedPreferences?.contains("userName")!!){
            startActivity(Intent(applicationContext,UserSignedInActivity::class.java))
            finish()
        }
        btn_Sign_In.setOnClickListener {
            var userName = et_Login.text.toString()
            var password = et_Password.text.toString()

            mySharedPreferences.edit().putString("userName",userName).apply()
            mySharedPreferences.edit().putString("password", password).apply()


            startActivity(Intent(applicationContext,UserSignedInActivity::class.java))
            finish()
        }
    }
}