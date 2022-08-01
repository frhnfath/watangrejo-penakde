package com.frhnfath.penakde.view.birth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frhnfath.penakde.R
import com.frhnfath.penakde.databinding.ActivityBirthBinding

class BirthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBirthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setTitle(R.string.akta_kelahiran)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnContinue.setOnClickListener {
            val intent = Intent(this, BirthActivity2::class.java)
            startActivity(intent)
        }

    }
}