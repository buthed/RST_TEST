package com.tematihonov.rst_test.domain.repository

import com.tematihonov.rst_test.domain.models.responseMain.ResponseMain

interface NetworkRepository {

    suspend fun getMain(): ResponseMain
}