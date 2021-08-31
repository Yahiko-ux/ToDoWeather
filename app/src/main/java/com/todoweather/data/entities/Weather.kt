package com.todoweather.data.entities

data class Weather(
    var id: Long,
    var main: String,
    var description: String,
    var icon: String
)
