package com.example.madpractical6_20012021008

import android.app.Service
import android.content.Intent
import android.os.Bundle
import android.os.IBinder
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    private val youtubeId ="M3ygFVrfR6E&ab_channel=England%26WalesCricketBoard"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val mywebview=findViewById<WebView>(R.id.webview)
        val settings = mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")

        val button=findViewById<FloatingActionButton>(R.id.fbutton1)
        button.setOnClickListener {
            Intent(this, MainActivity::class.java).apply { startActivity(this) }
        }
    }
}