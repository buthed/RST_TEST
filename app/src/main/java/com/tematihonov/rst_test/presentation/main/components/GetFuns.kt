package com.tematihonov.rst_test.presentation.main.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.tematihonov.rst_test.presentation.components.AppProgressIndicator
import com.tematihonov.rst_test.presentation.components.ExceptionText
import com.tematihonov.rst_test.presentation.main.MainViewModel
import com.tematihonov.rst_test.utils.ApiState
import com.tematihonov.rst_test.utils.ApiStateBlog

@Composable
fun MainGet(viewModel: MainViewModel) {
    when (val result = viewModel.response.value) {
        is ApiState.Success -> {
            TopButtons(result.data.data.buttons)
            CategoryTitle(result.data.data.content.last().title)
            if (result.data.data.content.last().title == "Блог") {
                viewModel.getBlog(result.data.data.content.last().url)
            }
            BlogGet(viewModel)
        }

        is ApiState.Fail -> {
            ExceptionText("${result.msg}")
        }

        ApiState.Loading -> { AppProgressIndicator() }
    }
}

@Composable
fun BlogGet(viewModel: MainViewModel) {
    when (val result = viewModel.responseBlog.value) {
        is ApiStateBlog.Success -> {
            LazyColumn() {
                items(result.data.data) { blog ->
                    BlogItem(blog) { viewModel.selectBlog(blog) }
                }
            }
        }

        is ApiStateBlog.Fail -> { ExceptionText("${result.msg}") }

        ApiStateBlog.Loading -> { AppProgressIndicator() }
    }
}