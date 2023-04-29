package com.shaunhossain.meditationui.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shaunhossain.meditationui.R
import com.shaunhossain.meditationui.ui.theme.ButtonBlue
import com.shaunhossain.meditationui.ui.theme.LightRed
import com.shaunhossain.meditationui.ui.theme.TextWhite

@Composable
fun CurrentMeditation(
    color: Color = LightRed
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .padding(vertical = 15.dp, horizontal = 20.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = "Daily thoughts",
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, color = TextWhite)
            )
            Text(
                text = "Meditation. 30-40 min",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = TextWhite
                )
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(ButtonBlue)
                .padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.play_icon),
                contentDescription = "play button",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}