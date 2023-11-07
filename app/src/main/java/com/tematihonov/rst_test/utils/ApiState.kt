package com.tematihonov.rst_test.utils

import com.tematihonov.rst_test.domain.models.responseMain.ResponseMain

sealed class ApiState {
    object Loading : ApiState()
    class Success(val data: ResponseMain) : ApiState()
    class Fail(val msg: Throwable) : ApiState()
    object Empty : ApiState()
}