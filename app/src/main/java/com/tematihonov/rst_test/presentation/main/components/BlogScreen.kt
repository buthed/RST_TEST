package com.tematihonov.rst_test.presentation.main.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.tematihonov.rst_test.R
import com.tematihonov.rst_test.presentation.components.AppDivider
import com.tematihonov.rst_test.presentation.main.MainViewModel
import com.tematihonov.rst_test.ui.spacing
import com.tematihonov.rst_test.ui.theme.Typography
import com.tematihonov.rst_test.ui.theme.backgroundColor
import com.tematihonov.rst_test.ui.theme.textColor

@Composable
fun BlogScreen(viewModel: MainViewModel) {

    val selectedBlog = viewModel.selectedBlog

    if (selectedBlog != null) {
        Column(Modifier.fillMaxSize().background(MaterialTheme.colorScheme.backgroundColor)) {
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.TopStart) {
                AsyncImage(
                    model = selectedBlog.image.lg,
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    contentScale = ContentScale.Fit
                )
                Box(Modifier.padding(start = 20.dp, top = 40.dp)) {
                    Box(modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(100))
                        .background(MaterialTheme.colorScheme.backgroundColor)
                        .clickable(onClick = { viewModel.selectedBlog = null }),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(painter = painterResource(id = R.drawable.arrow_back), contentDescription = "",
                            modifier = Modifier
                                .size(24.dp),
                            tint = MaterialTheme.colorScheme.textColor)
                    }
                }
            }

            Column(Modifier.padding(MaterialTheme.spacing.medium)) {
                Text(text = selectedBlog.date.date, style = Typography.bodySmall)
                Text(text = selectedBlog.title, style = Typography.titleLarge)
                AppDivider(modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = MaterialTheme.spacing.medium))
                Text(text = selectedBlog.subtitle,
                    style = Typography.bodyLarge)
            }
        }
    }
}