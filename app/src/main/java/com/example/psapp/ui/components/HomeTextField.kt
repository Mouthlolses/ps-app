package com.example.psapp.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun HomeTextField() {
    var searchText by remember { mutableStateOf("") }

    OutlinedTextField(
        value = searchText,
        onValueChange = { searchText = it },
        placeholder = { Text("Buscar..") },
        singleLine = true,
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxWidth()
    )
}
