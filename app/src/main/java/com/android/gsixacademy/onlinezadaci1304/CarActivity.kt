package com.android.gsixacademy.onlinezadaci1304

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_calculator_layout.*
import kotlinx.android.synthetic.main.activity_car.*
import kotlinx.android.synthetic.main.activity_car.text_view_title
import kotlinx.android.synthetic.main.recyclerview_list_item.*

class CarActivity: AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car)


          var myTitle = intent.getStringExtra("title")
          var myDescription = intent.getStringExtra("description")
          var myImageResource = intent.getIntExtra("imageResource", 0)



      //  Picasso.get().load(myImageResource).fit().fit().into(image_view_car_alfa_romeo)




      //    text_view_title.text = myTitle






//          text_view_title.text = myTitle
//
//          text_view_description.text = myDescription
//
//


    }

}