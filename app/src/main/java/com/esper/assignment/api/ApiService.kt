package com.esper.assignment.api

import retrofit2.http.GET

interface ApiService {

    @GET("mhrpatel12/esper-assignment/db")
    suspend fun getProducts()

}