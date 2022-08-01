package com.frhnfath.penakde.view.death

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frhnfath.penakde.R
import com.frhnfath.penakde.databinding.ActivityDeath2Binding

class DeathActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityDeath2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeath2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setTitle(R.string.jenazah)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnContinue.setOnClickListener {
            val intent = Intent(this, DeathActivity3::class.java)
            startActivity(intent)
        }
    }
}