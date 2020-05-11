package com.android.gsixacademy.onlinezadaci1304.movies

import com.android.gsixacademy.onlinezadaci1304.models.Car
import com.android.gsixacademy.onlinezadaci1304.models.MovieResult

sealed class MoviesAdapterClickEvent {
    data class MoviesAdapterItemClicked(val movieResult: MovieResult): MoviesAdapterClickEvent()
}


