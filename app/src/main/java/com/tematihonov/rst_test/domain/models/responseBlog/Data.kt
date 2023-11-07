package com.tematihonov.rst_test.domain.models.responseBlog

data class Data(
    val date: Date,
    val id: Int,
    val image: Image,
    val like: Int,
    val subtitle: String,
    val title: String,
    val view: Int
)