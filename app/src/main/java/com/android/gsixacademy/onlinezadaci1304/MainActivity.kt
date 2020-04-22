package com.android.gsixacademy.onlinezadaci1304

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_todo_list.*

class MainActivity : AppCompatActivity() {


    var listActivities: ArrayList<String> =
        arrayListOf("RelativeLayoutActivity", "CalculatorActivity", "TodoListActivity")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var activitiesAdapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, listActivities)

        list_view_activities.adapter = activitiesAdapter


        list_view_activities.setOnItemClickListener { adapterView, view, i, l ->


            var className = listActivities[i]


            when (className) {
                "RelativeLayoutActivity" -> startActivity(Intent(applicationContext, RelativeLayoutActivity::class.java))
                "CalculatorActivity" -> startActivity(Intent(applicationContext, CalculatorActivity::class.java))
                "TodoListActivity" -> startActivity(Intent(applicationContext, TodoListActivity::class.java))

            }

            Toast.makeText(applicationContext, className, Toast.LENGTH_LONG).show()

        }






    }









































}