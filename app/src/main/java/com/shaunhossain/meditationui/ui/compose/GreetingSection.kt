package com.shaunhossain.meditationui.ui.compose

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shaunhossain.meditationui.R
import com.shaunhossain.meditationui.ui.theme.TextWhite

@Composable
fun GreetingSection(
    name: String = "Shaun"
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {

        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Good Morning, $name",
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, color = TextWhite)
            )
            Text(
                text = "We wish you have a good day",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = TextWhite
                )
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.search_icon),
            contentDescription = "search icon",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )

    }
}