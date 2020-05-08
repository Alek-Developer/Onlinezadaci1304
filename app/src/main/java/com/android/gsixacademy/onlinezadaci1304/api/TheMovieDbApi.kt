package com.android.gsixacademy.onlinezadaci1304.api

import com.android.gsixacademy.onlinezadaci1304.models.PopularMovies
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheMovieDbApi {

    @GET("/3/movie/popular")
    fun getPopularMovies(@Query("api key") key: String): Call<PopularMovies>

}