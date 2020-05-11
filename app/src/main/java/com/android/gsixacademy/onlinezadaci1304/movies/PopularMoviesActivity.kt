package com.android.gsixacademy.onlinezadaci1304.movies

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.gsixacademy.onlinezadaci1304.R
import com.android.gsixacademy.onlinezadaci1304.api.ServiceBuilder
import com.android.gsixacademy.onlinezadaci1304.api.TheMovieDbApi
import com.android.gsixacademy.onlinezadaci1304.models.PopularMovies
import kotlinx.android.synthetic.main.activity_movies.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PopularMoviesActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        val request = ServiceBuilder.buildService(TheMovieDbApi::class.java)

        val call = request.getPopularMovies("8dd3a40cdacd660d79bce7c46bad942e")
        Log.d("moviesList","{?.size}")

        call.enqueue(object : Callback<PopularMovies> {
            override fun onResponse(call: Call<PopularMovies>, response: Response<PopularMovies>) {
                if (response.isSuccessful){

                    val popularMovies = response.body()

                    val moviesList = popularMovies?.results

                    Log.d("moviesList","${moviesList?.size}")
                    // do something with response


                    if(moviesList!=null) {
                        var moviesAdapter = MoviesAdapter(moviesList){}
                        recycler_view_movies.adapter = moviesAdapter
                    }

                }
            }
            override fun onFailure(call: Call<PopularMovies>, t: Throwable) {
                // show the error
            }
        })




    }
}