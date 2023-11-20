package com.bootcamp.apirickandmoney.api

import com.bootcamp.apirickandmoney.ResponseMorty
import retrofit2.http.GET
import retrofit2.Call

interface ApiService {

    @GET("character")
    fun getMorty() : Call<ResponseMorty>

}