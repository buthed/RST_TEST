package com.tematihonov.rst_test.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.tematihonov.rst_test.ui.theme.Typography

@Composable
fun ExceptionText(exception: String) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = exception, style = Typography.bodyMedium)
    }
}