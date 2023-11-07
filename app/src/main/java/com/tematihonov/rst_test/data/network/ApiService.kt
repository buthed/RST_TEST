package com.tematihonov.rst_test.data.network

import com.tematihonov.rst_test.domain.models.responseMain.ResponseMain
import com.tematihonov.rst_test.utils.RetrofitConstants.MAIN
import retrofit2.http.GET

interface ApiService {

    @GET(MAIN)
    suspend fun getMain(): ResponseMain

}