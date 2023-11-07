package com.tematihonov.rst_test.domain.usecase.network

import com.tematihonov.rst_test.domain.models.responseMain.ResponseMain
import com.tematihonov.rst_test.domain.repository.NetworkRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetMainUseCase @Inject constructor(
    private val networkRepository: NetworkRepository
) {

    suspend fun invoke(): Flow<ResponseMain> = flow {
        emit(networkRepository.getMain())
    }.flowOn(Dispatchers.IO)
}