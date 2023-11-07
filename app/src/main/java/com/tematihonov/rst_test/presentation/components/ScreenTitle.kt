package com.tematihonov.rst_test.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.tematihonov.rst_test.ui.spacing
import com.tematihonov.rst_test.ui.theme.Typography

@Composable
fun ScreenTitle(
    title: String
) {
    Text(text = title,
        modifier = Modifier.padding(MaterialTheme.spacing.medium),
        style = Typography.titleMedium)
}