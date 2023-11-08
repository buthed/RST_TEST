package com.tematihonov.rst_test.domain.usecase.network

import com.tematihonov.rst_test.domain.models.responseBlog.ResponseBlog
import com.tematihonov.rst_test.domain.repository.NetworkRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetBlogUseCase @Inject constructor(
    private val networkRepository: NetworkRepository
) {

    suspend fun invoke(url: String): Flow<ResponseBlog> = flow {
        emit(networkRepository.getBlog(url))
    }.flowOn(Dispatchers.IO)
}