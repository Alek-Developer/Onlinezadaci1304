package com.android.gsixacademy.onlinezadaci1304

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_todo_list.*

class TodoListActivity : AppCompatActivity() {

    var todoList = arrayListOf<String>("Honey", "Milk", "10 Eggs", "Orange Juice", "Carrots", "Dog Food", "Joghurt")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo_list)


        var arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoList)
        list_view_todo.adapter = arrayAdapter

        button_add_item.setOnClickListener {
            if (edit_text_todo_value.text.isNotEmpty()) {
                todoList.add(edit_text_todo_value.text.toString())
                var arrayAdapter =
                    ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoList)
                list_view_todo.adapter = arrayAdapter
                edit_text_todo_value.setText("")
            }
        }

        list_view_todo.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(applicationContext, todoList[i], Toast.LENGTH_LONG).show()
        }

        list_view_todo.setOnItemLongClickListener { adapterView, view, i, l ->
            var itemText = todoList[i]
            todoList.remove(todoList[i])
            var arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoList)
            list_view_todo.adapter = arrayAdapter
            return@setOnItemLongClickListener(true)
        }







    }

}