package com.example.psapp.ui.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import androidx.core.net.toUri


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

    val context = LocalContext.current
    val url = "https://www.europanet.com.br/upload/id_produto/60_____/6001506p.jpg"

    Card(
        modifier = Modifier
            .padding(top = 80.dp)
            .padding(horizontal = 16.dp)
            .size(width = 370.dp, height = 200.dp)
            .clickable {
                val intent = Intent(Intent.ACTION_VIEW, url.toUri())
                context.startActivity(intent)
            },
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


@Preview
@Composable
fun PreviewBanner() {
    Banner(imagemUrls = "https://www.europanet.com.br/upload/id_produto/60_____/6001506p.jpg")
}

