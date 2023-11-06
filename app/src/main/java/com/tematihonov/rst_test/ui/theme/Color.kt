package com.tematihonov.rst_test.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val ColorScheme.backgroundColor: Color @Composable
    get() = if (!isSystemInDarkTheme()) Color(0xFFFFFFFF) else Color(0xFF191919)

val ColorScheme.buttonTextColor: Color @Composable
get() = if (!isSystemInDarkTheme()) Color(0xFFFFFFFF) else Color(0xFFFAFAFA)

val ColorScheme.buttonTextBlueColor: Color @Composable
get() = if (!isSystemInDarkTheme()) Color(0xFF4096FB) else Color(0xFF1B7DDF)

val ColorScheme.buttonBgBlueColor: Color @Composable
get() = if (!isSystemInDarkTheme()) Color(0xFFF2F8FF) else Color(0xFF2B3641)

val ColorScheme.textColor: Color @Composable
get() = if (!isSystemInDarkTheme()) Color(0xFF0D0D0D) else Color(0xFFFAFAFA)

val ColorScheme.textBlueColor: Color @Composable
get() = if (!isSystemInDarkTheme()) Color(0xFF4096FB) else Color(0xFF1B7DDF)

val ColorScheme.textRedColor: Color @Composable
get() = if (!isSystemInDarkTheme()) Color(0xFFFF645C) else Color(0xFFE54131)

val ColorScheme.textGrayColor: Color @Composable
get() = if (!isSystemInDarkTheme()) Color(0xFFA6A6A6) else Color(0xFFA6A6A6)

val ColorScheme.indicatorGrayColor: Color @Composable
get() = if (!isSystemInDarkTheme()) Color(0xFFB6B6B6) else Color(0xFF818181)


