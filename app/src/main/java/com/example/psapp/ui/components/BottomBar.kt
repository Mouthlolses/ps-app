package com.example.psapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.psapp.R


@Preview
@Composable
fun CustomBottomBar() {
    val colorBrush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFFEBEBF3),
            Color.Gray
        )
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
            .background(colorBrush)
            .padding(horizontal = 16.dp)
            .padding(top = 8.dp) // altura que você quiser
            .navigationBarsPadding(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /* ação */ }) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    painter = painterResource(R.drawable.icon_2),
                    contentDescription = "Início",
                    modifier = Modifier
                        .size(20.dp)
                        .offset(y = (-2).dp)
                )
            }
        }
        IconButton(onClick = { /* ação */ }) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    painter = painterResource(R.drawable.icon_1),
                    contentDescription = "Home",
                    modifier = Modifier
                        .size(20.dp)
                        .offset(y = (-2).dp)
                )
            }
        }
        IconButton(onClick = { /* ação */ }) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    painter = painterResource(R.drawable.icon_account),
                    contentDescription = "Perfil",
                    modifier = Modifier
                        .size(20.dp)
                        .offset(y = (-2).dp)
                )
            }
        }
    }
}