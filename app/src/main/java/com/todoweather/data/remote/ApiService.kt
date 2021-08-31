package com.todoweather.data.remote

import com.todoweather.data.entities.Welcome
import com.todoweather.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("weather")
    suspend fun getCurrentWeather(
        @Query("q") cityName: String,
        @Query("appid")
        appid: String = Constants.appid
    ): Welcome
}