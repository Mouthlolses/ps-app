package com.example.psapp.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Card() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .size(width = 400.dp, height = 150.dp),
        onClick = {}
    ) {
        Text(
            text = "Primeiro Card",
            modifier = Modifier
                .padding(16.dp)
        )
    }
}




@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    Card()
}
