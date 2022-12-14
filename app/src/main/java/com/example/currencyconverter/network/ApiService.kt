package com.example.currencyconverter.network

import com.example.currencyconverter.model.ApiResponse
import retrofit2.Response
import retrofit2.http.Query

interface ApiService {

    suspend fun convertCurrency(
        @Query("api_key") access_key: String,
        @Query("from") from: String,
        @Query("to") to: String,
        @Query("amount") amount: Double
    ):Response<ApiResponse>
}