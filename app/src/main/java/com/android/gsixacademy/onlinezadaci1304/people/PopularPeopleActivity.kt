package com.android.gsixacademy.onlinezadaci1304.people

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.gsixacademy.onlinezadaci1304.R
import com.android.gsixacademy.onlinezadaci1304.api.ServiceBuilder
import com.android.gsixacademy.onlinezadaci1304.api.TheMovieDbApi
import com.android.gsixacademy.onlinezadaci1304.models.PopularMovies
import com.android.gsixacademy.onlinezadaci1304.models.PopularPeople
import kotlinx.android.synthetic.main.activity_movies.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PopularPeopleActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_people)

        val request = ServiceBuilder.buildService(TheMovieDbApi::class.java)

        val call = request.getPopularPeople("8dd3a40cdacd660d79bce7c46bad942e")
        Log.d("moviesList","{?.size}")

        call.enqueue(object : Callback<PopularPeople> {
            override fun onResponse(call: Call<PopularPeople>, response: Response<PopularPeople>) {
                if (response.isSuccessful){

                    val popularPeople = response.body()

                    val popularPeopleList = popularPeople?.results

                    Log.d("popularPeopleList","${popularPeopleList?.size}")
                    // do something with response


                    if(popularPeopleList!=null) {

                    }

                }
            }
            override fun onFailure(call: Call<PopularPeople>, t: Throwable) {
                // show the error
            }
        })




    }
}