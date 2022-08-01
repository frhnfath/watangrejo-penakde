package com.frhnfath.penakde.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.frhnfath.penakde.R
import com.frhnfath.penakde.databinding.ActivityWebsiteBinding

class WebsiteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWebsiteBinding
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebsiteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setTitle(R.string.web_desa)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        webViewSetup()
    }

    private fun webViewSetup() {
        webView = binding.webView
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://google.co.id/")

        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) webView.goBack()
        else super.onBackPressed()
    }
}