package com.android.gsixacademy.onlinezadaci1304

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_user_sign_in.*

class UserSignedInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_sign_in)


        var mySharedPreferences = getSharedPreferences("KotlinBasicTutorialPreferences", Context.MODE_PRIVATE)


        var username = mySharedPreferences!!.getString("userName","/")

        text_view_title.text = "Signed in user is $username"


        button_log_out.setOnClickListener {
            mySharedPreferences.edit().remove("userName")
            onBackPressed()


    }
}