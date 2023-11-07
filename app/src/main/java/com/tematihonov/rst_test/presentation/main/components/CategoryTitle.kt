package com.tematihonov.rst_test.presentation.main.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.tematihonov.rst_test.ui.spacing
import com.tematihonov.rst_test.ui.theme.Typography

@Composable
fun CategoryTitle(categoryTitle: String) {
    Text(text = categoryTitle,
        modifier = Modifier.padding(
            start = MaterialTheme.spacing.medium,
            end = MaterialTheme.spacing.medium,
            top = MaterialTheme.spacing.large,
            bottom = MaterialTheme.spacing.small),
        style = Typography.titleLarge)
}