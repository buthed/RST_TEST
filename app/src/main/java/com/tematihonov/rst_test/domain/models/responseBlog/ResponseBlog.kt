package com.tematihonov.rst_test.domain.models.responseBlog

data class ResponseBlog(
    val `data`: List<Data>,
    val error: Any,
    val success: Boolean,
    val time: String
)