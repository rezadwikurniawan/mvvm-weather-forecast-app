package com.kurniawan.reza.forecastappmvvm.data.network

import androidx.lifecycle.LiveData
import com.kurniawan.reza.forecastappmvvm.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {

    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )

}