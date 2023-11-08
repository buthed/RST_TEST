package com.tematihonov.rst_test.presentation.main.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.tematihonov.rst_test.domain.models.responseBlog.Data
import com.tematihonov.rst_test.presentation.components.AppDivider
import com.tematihonov.rst_test.ui.spacing
import com.tematihonov.rst_test.ui.theme.Typography
import com.tematihonov.rst_test.ui.theme.textColor

@Composable
fun BlogItem(blog: Data, onBlogClick: () -> Unit) {
    Column(modifier = Modifier.clickable(onClick = onBlogClick)) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = MaterialTheme.spacing.medium,
                    vertical = MaterialTheme.spacing.small
                ),
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = blog.image.sm,
                contentDescription = "",
                modifier = Modifier.size(80.dp).clip(RoundedCornerShape(MaterialTheme.spacing.small)),
                contentScale = ContentScale.Crop
            ) //TODO add
            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    text = blog.title,
                    style = Typography.bodyLarge,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = blog.subtitle,
                    style = Typography.bodySmall,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 3,
                    color = MaterialTheme.colorScheme.textColor
                )
            }
        }
        AppDivider(Modifier.fillMaxWidth().padding(start = 112.dp))
    }
}