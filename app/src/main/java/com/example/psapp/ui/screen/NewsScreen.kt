package com.example.psapp.ui.screen

import android.annotation.SuppressLint
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.viewinterop.AndroidView


@SuppressLint("SetJavaScriptEnabled")
@Composable
fun NewsScreen() {
    val url = "https://developer.android.com/news?hl=pt-br"
    val webViewClient = remember { WebViewClient() }

    AndroidView(
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                settings.cacheMode = WebSettings.LOAD_DEFAULT
                this.webViewClient = webViewClient
                loadUrl(url)

            }
        },
        update = { it.loadUrl(url) }
    )
}