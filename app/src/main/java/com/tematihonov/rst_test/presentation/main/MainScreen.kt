package com.tematihonov.rst_test.presentation.main

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.tematihonov.rst_test.R
import com.tematihonov.rst_test.presentation.components.AppProgressIndicator
import com.tematihonov.rst_test.presentation.components.ExceptionText
import com.tematihonov.rst_test.presentation.components.ScreenTitle
import com.tematihonov.rst_test.presentation.main.components.BlogItem
import com.tematihonov.rst_test.presentation.main.components.BlogScreen
import com.tematihonov.rst_test.presentation.main.components.CategoryTitle
import com.tematihonov.rst_test.presentation.main.components.TopButtons
import com.tematihonov.rst_test.utils.ApiState
import com.tematihonov.rst_test.utils.ApiStateBlog

@Composable
fun MainScreen() {
    val viewModel = hiltViewModel<MainViewModel>()

    Column(Modifier.fillMaxSize()) {
        ScreenTitle(stringResource(id = R.string.screen_main))
        MainGet(viewModel)
    }

    AnimatedVisibility(visible = viewModel.selectedBlog != null) {
        BlogScreen(viewModel)
    }
}

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