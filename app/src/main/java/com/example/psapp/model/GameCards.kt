package com.example.psapp.model

import androidx.annotation.DrawableRes
import com.example.psapp.R
import java.math.BigDecimal

data class GameCards(
    val title: String,
    val price: BigDecimal,
    @DrawableRes val cover: Int,
)

val cardItems = listOf(
    GameCards("Ghost of Yotei", BigDecimal(399.99), R.drawable.game_image),
    GameCards("GTA 6", BigDecimal(349.99), R.drawable.gta6),
    GameCards("Elden Ring Nightreign", BigDecimal(349.99), R.drawable.eldenring_nigh),
    GameCards("Silent Hill f", BigDecimal(349.99), R.drawable.silenthill_f)
)