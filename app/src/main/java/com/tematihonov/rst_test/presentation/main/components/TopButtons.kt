package com.tematihonov.rst_test.presentation.main.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tematihonov.rst_test.R
import com.tematihonov.rst_test.ui.spacing
import com.tematihonov.rst_test.ui.theme.buttonTextColor

@Composable
fun TopButtons() {

    LazyRow(
        Modifier.padding(start = MaterialTheme.spacing.medium),
        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
    ) {
        items(1) {
            Row(horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)) {
                RstWeatherButton()
                RstHelpButton()
                RstMapButton()
            }
        }
    } //TODO recreate
}

@Composable
fun RstWeatherButton() {
    Box(
        Modifier
            .height(40.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFFFF9130),
                        Color(0xFFFF451A)
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            Modifier
                .wrapContentWidth()
                .padding(MaterialTheme.spacing.small),
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
        ) {
            Image(
                painter = painterResource(id = R.drawable.weather), contentDescription = "",
                modifier = Modifier.size(24.dp)
            )
            Text(text = "+29 \u2103", color = MaterialTheme.colorScheme.buttonTextColor) //TODO add to string
        }
    }
}

@Composable
fun RstHelpButton() {
    Box(
        Modifier
            .height(40.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFF217AC4),
                        Color(0xFF318EC4)
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            Modifier
                .wrapContentWidth()
                .padding(MaterialTheme.spacing.small),
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
        ) {
            Image(
                painter = painterResource(id = R.drawable.about_base), contentDescription = "",
                modifier = Modifier.size(24.dp)
            )
            Text(text = "О базе отдыха", color = MaterialTheme.colorScheme.buttonTextColor) //TODO add to string
        }
    }
}

@Composable
fun RstMapButton() {
    Box(
        Modifier
            .height(40.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFF425361),
                        Color(0xFF25313B)
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            Modifier
                .wrapContentWidth()
                .padding(MaterialTheme.spacing.small),
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small)
        ) {
            Image(
                painter = painterResource(id = R.drawable.how_to_get), contentDescription = "",
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Как добраться", color = MaterialTheme.colorScheme.buttonTextColor) //TODO add to string
        }
    }
}

