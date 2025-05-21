package com.example.psapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.psapp.model.cardItems
import com.example.psapp.ui.components.Banner
import com.example.psapp.ui.components.MeuCard


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val imagemUrl = listOf(
        "https://www.europanet.com.br/upload/id_produto/60_____/6001506p.jpg",
        "https://www.gtavice.net/content/images/gta-vi-key-3840x2160.jpg",
        "https://images8.alphacoders.com/138/1385514.png",
        "https://www.kojimaproductions.jp/sites/default/files/2025-03/products_coverimage0309.jpg",
        "https://www.silenthillmemories.net/shf/art/pics/silent_hill_f_key_art_01.jpg"
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column {
            LazyRow(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                items(imagemUrl) { imagemUrls ->
                    Banner(imagemUrls)
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Text(
                    text = "Store",
                    fontFamily = FontFamily.SansSerif,
                    fontStyle = FontStyle.Normal,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .offset(x = 20.dp, y = 15.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(cardItems) { item ->
                    MeuCard(item)
                }
            }
        }
    }
}


@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}
