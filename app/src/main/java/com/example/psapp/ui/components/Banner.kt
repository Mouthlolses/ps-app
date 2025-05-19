package com.example.psapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage


@Composable
fun Banner(imagemUrls: String) {
    val bannerBrush = Brush.linearGradient(
        colors = listOf(
            Color(0xFFEBEBF3),
            Color(0xFF044BBD)
        ),
        start = Offset(0f, 0f),
        end = Offset(1000f, 0f)

    )


    Card(
        onClick = {},
        modifier = Modifier
            .padding(top = 100.dp)
            .padding(horizontal = 16.dp)
            .size(width = 370.dp, height = 200.dp),
        colors = CardColors(
            contentColor = Color.Black,
            containerColor = Color.White,
            disabledContainerColor = Color.White,
            disabledContentColor = Color.White
        ),
        border = BorderStroke(8.dp, bannerBrush)
    ) {
        AsyncImage(
            model = imagemUrls,
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
    }
}


