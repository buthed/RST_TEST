package com.tematihonov.rst_test.presentation.main.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tematihonov.rst_test.R
import com.tematihonov.rst_test.presentation.components.AppDivider
import com.tematihonov.rst_test.ui.spacing
import com.tematihonov.rst_test.ui.theme.Typography
import com.tematihonov.rst_test.ui.theme.textColor

@Composable
fun BlogItem() {
    Column {
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
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                modifier = Modifier.size(80.dp)
            ) //TODO add
            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    text = "Молодёжная",
                    style = Typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                ) //TODO add
                Text(
                    text = "В частности, новая модель организационной деятельности говорит о возможностях модели развития организационной деятельности говорит организационной деятельности говорит ",
                    style = Typography.bodySmall,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 3,
                    color = MaterialTheme.colorScheme.textColor
                ) //TODO add
            }
        }
        AppDivider(Modifier.fillMaxWidth().padding(start = 112.dp))
    }
}

@Preview
@Composable
fun BlogItemPreview() {
    BlogItem()
}