package com.tematihonov.rst_test.presentation.main.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tematihonov.rst_test.R
import com.tematihonov.rst_test.presentation.components.AppDivider
import com.tematihonov.rst_test.ui.spacing
import com.tematihonov.rst_test.ui.theme.Typography
import com.tematihonov.rst_test.ui.theme.backgroundColor

@Composable
fun BlogScreen() {
    Column(Modifier.background(MaterialTheme.colorScheme.backgroundColor)) {
        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.TopStart) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                contentScale = ContentScale.FillBounds //TODO add
            )
            Box(Modifier.padding(start = 20.dp, top = 40.dp)) {
                Box(modifier = Modifier
                    .clip(RoundedCornerShape(100))
                    .background(MaterialTheme.colorScheme.backgroundColor),
                    contentAlignment = Alignment.Center
                ) {
                    Image(painter = painterResource(id = R.drawable.arrow_back), contentDescription = "",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(4.dp)) //TODO check on bag
                }
            }
        }

        Column(Modifier.padding(MaterialTheme.spacing.medium)) {
            Text("20.10.2021", style = Typography.bodySmall) //TODO add
            Text("Двухэтажная Сауна! Бассейн, Бильярд, Караоке! ВеникиАкция! Час 850", style = Typography.titleLarge) //TODO add
            AppDivider(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = MaterialTheme.spacing.medium))
            Text(text = "Уважаемые гости будем рады видеть Вас в нашей уютной сауне! И предоставить Вам отметить самый долгожданный праздник года, Новый год и предновогоднии праздники !!!",
                style = Typography.bodyLarge) //TODO add
        }
    }
}

@Preview
@Composable
fun BlogScreenPreview() {
    BlogScreen()
}