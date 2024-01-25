package com.example.earthquake.api

import android.telecom.Call

interface EarquakeService {
    //where you list out the different endpoints in the API you want to call
    // fucttio returns Call<type> where type is

    fun getEarthquakeDataPastDay (): Call<FeatureCollection>

}