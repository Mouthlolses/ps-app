package com.example.psapp.ui.components

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import com.example.psapp.R
import com.example.psapp.extensions.toBrazilianCurrency
import com.example.psapp.model.GameCards
import java.math.BigDecimal


@Composable
fun MeuCard(item: GameCards, onClick: () -> Unit) {

    Surface(
        modifier = Modifier
            .padding(8.dp),
        shape = RoundedCornerShape(16.dp),
        tonalElevation = 16.dp,
        shadowElevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .heightIn(20.dp, 250.dp)
                .widthIn(20.dp, 250.dp)
                .background(Color(0xFFFBFCFD))
        ) {
            val boxSize = 100.dp
            val imageSize = 160.dp
            val offset = 50.dp

            Box(
                modifier = Modifier
                    .height(boxSize)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFF1C4DC1), Color.Transparent
                            )
                        )
                    )
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = item.cover),
                    contentDescription = null,
                    modifier = Modifier
                        .offset(y = offset)
                        .size(imageSize)
                        .clip(RoundedCornerShape(8.dp))
                        .align(Alignment.BottomCenter)
                        .clickable {
                            onClick()
                        },
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(offset))
            Column(
                Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = item.title,
                    maxLines = 1,
                )
                Text(
                    text = item.price.toBrazilianCurrency(),
                    maxLines = 1,
                    modifier = Modifier
                        .padding(top = 16.dp)
                )
            }

        }
    }
}


