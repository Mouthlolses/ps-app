package com.example.psapp.model

import androidx.annotation.DrawableRes
import java.math.BigDecimal

data class GameCards(
    val id: Int,
    val title: String,
    val price: BigDecimal,
    val url: String,
    @DrawableRes val cover: Int,
)

