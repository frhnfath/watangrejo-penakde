package com.frhnfath.penakde.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frhnfath.penakde.view.birth.BirthActivity
import com.frhnfath.penakde.databinding.ActivityMainBinding
import com.frhnfath.penakde.view.death.DeathActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btnBirth.setOnClickListener {
            val intent = Intent(this, BirthActivity::class.java)
            startActivity(intent)
        }

        binding.btnAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        binding.btnWeb.setOnClickListener {
            val intent = Intent(this, WebsiteActivity::class.java)
            startActivity(intent)
        }

        binding.btnDeath.setOnClickListener {
            val intent = Intent(this, DeathActivity::class.java)
            startActivity(intent)
        }
    }
}