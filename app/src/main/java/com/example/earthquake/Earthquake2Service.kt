package com.example.earthquake

import android.telecom.Call
import retrofit2.http.GET

interface Earquake2Service {
    //where you list out the different endpoints in the API you want to call
    // fucttio returns Call<type> where type is
    // in the @GET("blah"), "blah" is the path to the file (endpoint)

    @GET("all_day.geojson")
    fun getEarthquakeDataPastDay (): Call<FeatureCollection>

}