package com.frhnfath.penakde.view.birth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frhnfath.penakde.view.CameraActivity
import com.frhnfath.penakde.R
import com.frhnfath.penakde.databinding.ActivityBirth3Binding

class BirthActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityBirth3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirth3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setTitle(R.string.ktp_saksi)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnCameraSaksi1.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }

        binding.btnCameraSaksi2.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }

        binding.btnContinue.setOnClickListener {
            val intent = Intent(this, BirthActivity4::class.java)
            startActivity(intent)
        }
    }
}