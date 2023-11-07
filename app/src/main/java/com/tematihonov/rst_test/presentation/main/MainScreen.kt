package com.tematihonov.rst_test.presentation.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.tematihonov.rst_test.R
import com.tematihonov.rst_test.presentation.components.AppProgressIndicator
import com.tematihonov.rst_test.presentation.components.ExceptionText
import com.tematihonov.rst_test.presentation.components.ScreenTitle
import com.tematihonov.rst_test.presentation.main.components.TopButtons
import com.tematihonov.rst_test.utils.ApiState

@Composable
fun MainScreen() {
    val viewModel = hiltViewModel<MainViewModel>()

    Column(Modifier.fillMaxSize()) {
        ScreenTitle(stringResource(id = R.string.screen_main))

//        CategoryTitle("Блог")
        BlogList(viewModel)
    }
}

@Composable
fun BlogList(viewModel: MainViewModel) {
    when (val result = viewModel.response.value) {
        is ApiState.Success -> {
            TopButtons(result.data.data.buttons)
        }

        is ApiState.Fail -> {
            ExceptionText("${result.msg}")
        }

        ApiState.Loading -> {
            AppProgressIndicator()
        }

        ApiState.Empty -> {

        }
    }
}