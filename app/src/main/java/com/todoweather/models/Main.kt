package com.todoweather.models


data class Main(
    var temp: Double,
    var feelsLike: Double,
    var tempMin: Double,
    var tempMax: Double,
    var pressure: Long,
    var humidity: Long
)
