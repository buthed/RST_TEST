package com.tematihonov.rst_test.domain.models.responseMain

data class ResponseMain(
    val `data`: Data,
    val error: Any,
    val success: Boolean,
    val time: String
)