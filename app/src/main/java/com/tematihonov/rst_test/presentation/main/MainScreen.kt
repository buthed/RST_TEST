package com.tematihonov.rst_test.presentation.main

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.tematihonov.rst_test.R
import com.tematihonov.rst_test.presentation.components.ScreenTitle
import com.tematihonov.rst_test.presentation.main.components.BlogScreen
import com.tematihonov.rst_test.presentation.main.components.MainGet

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