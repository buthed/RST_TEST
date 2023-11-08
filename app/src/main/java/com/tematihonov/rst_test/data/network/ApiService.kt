package com.tematihonov.rst_test.data.network

import com.tematihonov.rst_test.domain.models.responseBlog.ResponseBlog
import com.tematihonov.rst_test.domain.models.responseMain.ResponseMain
import com.tematihonov.rst_test.utils.RetrofitConstants.MAIN
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {

    @GET(MAIN)
    suspend fun getMain(): ResponseMain

    @GET
    suspend fun getBlog(
        @Url url: String
    ): ResponseBlog
}