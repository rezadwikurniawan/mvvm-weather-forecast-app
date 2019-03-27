package com.kurniawan.reza.forecastappmvvm.data.network.response

import com.google.gson.annotations.SerializedName
import com.kurniawan.reza.forecastappmvvm.data.db.entity.CurrentWeatherEntry
import com.kurniawan.reza.forecastappmvvm.data.db.entity.Location

data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: Location
)