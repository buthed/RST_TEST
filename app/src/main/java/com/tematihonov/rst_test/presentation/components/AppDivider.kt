package com.tematihonov.rst_test.presentation.components

import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tematihonov.rst_test.ui.theme.dividerColor

@Composable
fun AppDivider(modifier: Modifier) {
    Divider(
        modifier = modifier,
        thickness = 1.dp,
        color = MaterialTheme.colorScheme.dividerColor,
    )
}