package com.frhnfath.penakde.view.death

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frhnfath.penakde.R
import com.frhnfath.penakde.databinding.ActivityDeathBinding

class DeathActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDeathBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeathBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setTitle(R.string.akta_kematian)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnContinue.setOnClickListener {
            val intent = Intent(this, DeathActivity2::class.java)
            startActivity(intent)
        }
    }
}