package com.android.gsixacademy.onlinezadaci1304

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recyclerview_list_item.*

class MainActivity : AppCompatActivity() {


    var listActivities: ArrayList<String> =
        arrayListOf("RelativeLayoutActivity", "CalculatorActivity", "TodoListActivity", "RecycleViewActivity", "LoginActivity")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


          Picasso.get().load("https://www.ecopetit.cat/wpic/mpic/234-2340282_black-sports-ca-lamborghini-huracan-wallpaper-lamborghini-wallpaper.jpg").fit().into(image_view_background);



        var activitiesAdapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, listActivities)

        list_view_activities.adapter = activitiesAdapter


        list_view_activities.setOnItemClickListener { adapterView, view, i, l ->


            var className = listActivities[i]


            when (className) {
                "RelativeLayoutActivity" -> startActivity(Intent(applicationContext, RelativeLayoutActivity::class.java))
                "CalculatorActivity" -> startActivity(Intent(applicationContext, CalculatorActivity::class.java))
                "TodoListActivity" -> startActivity(Intent(applicationContext, TodoListActivity::class.java))
                "RecycleViewActivity" -> startActivity(Intent(applicationContext, RecycleViewActivity::class.java))
                "LoginActivity" -> startActivity(Intent(applicationContext, LoginActivity::class.java))
            }

            Toast.makeText(applicationContext, className, Toast.LENGTH_LONG).show()

        }






    }









































}