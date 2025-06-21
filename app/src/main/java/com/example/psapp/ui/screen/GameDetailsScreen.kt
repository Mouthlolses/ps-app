package com.example.psapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.psapp.R

@Preview
@Composable
fun GameDetailsScreen() {

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .background(Color(0xFF0A4DEA))
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(top = 36.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.game_image),
                contentDescription = null,
                modifier = Modifier
                    .padding(24.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Text(
                text = "Uma lenda renasce na névoa das montanhas…",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.SansSerif,
                fontSize = 20.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            HorizontalDivider()
            Card(
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .size(400.dp)
                    .padding(6.dp)
            ) {
                Column(
                    modifier = Modifier
                        .verticalScroll(scrollState)
                        .padding(8.dp)
                ) {
                    Text(
                        text = "Em Ghost of Yotei, você assume o papel de um guerreiro solitário guiado pelos espíritos ancestrais do Monte Yōtei conhecido como o \"Fuji de Hokkaido\"." +
                                "Após uma tragédia que devastou sua vila, o protagonista retorna do mundo dos mortos com uma missão: restaurar a honra de seu clã e eliminar a corrupção que se espalha como sombra pela terra sagrada.",
                        fontFamily = FontFamily.Serif,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .padding(start = 8.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "⚔\uFE0F Combate tático e fluido: Enfrente samurais corrompidos, espíritos vingativos e criaturas do folclore japonês em batalhas intensas que exigem precisão, estratégia e coragem.",
                        fontFamily = FontFamily.Serif,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .padding(start = 8.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "\uD83C\uDF2B\uFE0F Exploração mística: Viaje por florestas enevoadas, ruínas antigas e santuários esquecidos em um mundo aberto inspirado na estética e espiritualidade do Japão feudal.",
                        fontFamily = FontFamily.Serif,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .padding(start = 8.dp)
                    )
                }
            }
            HorizontalDivider()
            Spacer(modifier = Modifier.height(8.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(100.dp)
                    .padding(8.dp)
            ) {
                Text(
                    text = "R$ 399,00",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                        .padding(top = 8.dp)
                )
                OutlinedButton(
                    onClick = {},
                    contentPadding = ButtonDefaults.ButtonWithIconContentPadding,
                    modifier = Modifier
                        .offset(x = 170.dp)
                ) {
                    Icon(
                        Icons.Filled.ShoppingCart,
                        contentDescription = "Buy",
                        modifier = Modifier.size(ButtonDefaults.IconSize)
                    )
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text("Adicionar ao carinho")
                }
            }
        }
    }
}