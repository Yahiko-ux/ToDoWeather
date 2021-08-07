package com.todoweather.models

data class Welcome(
    var coord: Coord,
    var weather: List<Weather>,
    var base: String,
    var main: Main,
    var visibility: Long,
    var wind: Wind,
    var clouds: Clouds,
    var dt: Long,
    var sys: Sys,
    var timezone: Long,
    var id: Long,
    var name: String,
    var cod: Long
)
