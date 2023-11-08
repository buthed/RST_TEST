package com.tematihonov.rst_test.data.repositoryImpl

import com.tematihonov.rst_test.data.network.ApiService
import com.tematihonov.rst_test.domain.models.responseBlog.ResponseBlog
import com.tematihonov.rst_test.domain.models.responseMain.ResponseMain
import com.tematihonov.rst_test.domain.repository.NetworkRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkRepositoryImpl @Inject constructor(
    private val apiService: ApiService
): NetworkRepository {

    override suspend fun getMain(): ResponseMain {
        return apiService.getMain()
    }

    override suspend fun getBlog(url: String): ResponseBlog {
        return apiService.getBlog(url)
    }
}