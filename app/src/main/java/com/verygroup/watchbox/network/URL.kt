package com.verygroup.watchbox.network

import com.verygroup.watchbox.BuildConfig

object URL {
    private const val apiKey : String = BuildConfig.API_KEY
    private const val baseURL : String = BuildConfig.BASE_URL

    val URL = "$baseURL$apiKey/"

    const val GET_LATEST_CURRENCIES = "latest/USD"
}