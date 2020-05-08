package com.android.gsixacademy.onlinezadaci1304

import com.android.gsixacademy.onlinezadaci1304.models.Car

sealed class CarsAdapterClickEvent  {
    data class  CarsAdapterItemClicked(var car: Car): CarsAdapterClickEvent()




}