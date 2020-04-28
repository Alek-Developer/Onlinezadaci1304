package com.android.gsixacademy.onlinezadaci1304

sealed class CarsAdapterClickEvent  {
    data class  CarsAdapterItemClicked(var car: Car): CarsAdapterClickEvent()




}