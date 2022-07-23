package com.example.memelist.api

import com.example.memelist.model.IDResponse
import com.example.memelist.model.MemeResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface MemeService {
//https://alpha-meme-maker.herokuapp.com/
    @GET("{pageNum}")
    suspend fun getMemesByPageNum(
        @Path("pageNum") num: Int
    ): Response<MemeResponse>

    @GET("memes/{id}")
    suspend fun getMemeByID(
        @Path ("id") id: Int? = null
    ): Response<IDResponse>
}