package com.tematihonov.rst_test.domain.usecase

import com.tematihonov.rst_test.domain.usecase.network.GetBlogUseCase
import com.tematihonov.rst_test.domain.usecase.network.GetMainUseCase

data class NetworkUseCase(
    val getMainUseCase: GetMainUseCase,
    val getBlogUseCase: GetBlogUseCase
)
