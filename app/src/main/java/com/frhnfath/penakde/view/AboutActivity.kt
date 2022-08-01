package com.frhnfath.penakde.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frhnfath.penakde.R
import com.frhnfath.penakde.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setTitle(R.string.tentang_desa)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}