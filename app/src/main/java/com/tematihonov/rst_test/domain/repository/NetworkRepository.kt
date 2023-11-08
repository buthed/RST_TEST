package com.tematihonov.rst_test.domain.repository

import com.tematihonov.rst_test.domain.models.responseBlog.ResponseBlog
import com.tematihonov.rst_test.domain.models.responseMain.ResponseMain

interface NetworkRepository {

    suspend fun getMain(): ResponseMain

    suspend fun getBlog(url: String): ResponseBlog
}