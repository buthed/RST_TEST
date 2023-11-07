package com.tematihonov.rst_test.presentation.components

import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AppDivider(modifier: Modifier) {
    Divider(
        modifier = modifier,
        thickness = 1.dp,
        color = Color(0xFFF5F5F5),
    )
}