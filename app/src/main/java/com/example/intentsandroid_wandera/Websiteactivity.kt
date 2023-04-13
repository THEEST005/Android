package com.example.intentsandroid_wandera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Websiteactivity : AppCompatActivity() {
    private lateinit var myWeb:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_websiteactivity)

        myWeb = findViewById(R.id.mWeb)

        val webSettings = myWeb.settings
        webSettings.javaScriptEnabled = true
        myWeb.loadUrl("https://google.com")
    }
}