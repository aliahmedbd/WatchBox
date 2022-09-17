package com.verygroup.watchbox.network

import android.content.Context

class NetworkModule(val context: Context) {
    fun sourceOfNetwork(): APIService {
        return APIClient.create()
    }
}