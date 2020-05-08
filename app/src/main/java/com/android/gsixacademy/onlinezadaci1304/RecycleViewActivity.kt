package com.android.gsixacademy.onlinezadaci1304

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.gsixacademy.onlinezadaci1304.models.Car
import kotlinx.android.synthetic.main.activity_recyclerview.*

class RecycleViewActivity : AppCompatActivity() {

    var listCars: ArrayList<Car> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        listCars.add(
            Car(
                "Mclaren",
                "MC Description",
                R.drawable.mclaren
            )
        )
        listCars.add(
            Car(
                "Honda",
                "Honda Description",
                R.drawable.honda_nsx
            )
        )
        listCars.add(
            Car(
                "Jaguar",
                "Jaguar Description",
                R.drawable.jaguar_f
            )
        )
        listCars.add(
            Car(
                "Mercedes",
                "Mercedes Description",
                R.drawable.mercedes_amg
            )
        )
        listCars.add(
            Car(
                "Audi",
                "Audi Description",
                R.drawable.audi_r
            )
        )
        listCars.add(
            Car(
                "Aston Martin",
                "Aston Martin Description",
                R.drawable.aston_martin
            )
        )
        listCars.add(
            Car(
                "Aston Martin 2",
                "Aston Martin Description ",
                R.drawable.aston_martin1
            )
        )
        listCars.add(
            Car(
                "Maserati",
                "Maserati Description ",
                R.drawable.maserati_granturismo
            )
        )
        listCars.add(
            Car(
                "Nissan",
                "Nissan Description ",
                R.drawable.nissan
            )
        )
        listCars.add(
            Car(
                "lamborghini_huracan",
                "lamborghini_huracan Description: Spead 340km, 2.9sec/100km ",
                R.drawable.lamborghini_huracan
            )
        )



        for(number in 0..100) {
            listCars.add(
                Car(
                    "lamborghini_huracan",
                    "lamborghini_huracan Description $number",
                    R.drawable.lamborghini_huracan
                )
            )
        }

        var carsAdapter: CarsAdapter = CarsAdapter(listCars) {
            if(it is CarsAdapterClickEvent.CarsAdapterItemClicked){
                var carClicked = it.car
                Toast.makeText(applicationContext,"${carClicked.title}", Toast.LENGTH_LONG).show()

               var intent = Intent(applicationContext, CarActivity::class.java)
               intent.putExtra("title",carClicked.title)
               intent.putExtra("description",carClicked.description)
               intent.putExtra("imageResource",carClicked.imageResource)
               startActivity(intent)






            }
        }
        recyclerview_activity.adapter = carsAdapter
    }




}