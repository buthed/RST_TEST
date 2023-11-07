package com.tematihonov.rst_test.presentation.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.tematihonov.rst_test.R
import com.tematihonov.rst_test.presentation.components.ScreenTitle
import com.tematihonov.rst_test.presentation.main.components.BlogItem
import com.tematihonov.rst_test.presentation.main.components.CategoryTitle
import com.tematihonov.rst_test.presentation.main.components.TopButtons

@Composable
fun MainScreen() {
    Column(Modifier.fillMaxSize()) {
        ScreenTitle(stringResource(id = R.string.screen_main))
        TopButtons()
        CategoryTitle("Блог")
        LazyColumn() {
            items(6) {
                BlogItem()
            }
        }
    }
}