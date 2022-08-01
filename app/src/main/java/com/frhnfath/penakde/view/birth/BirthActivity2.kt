package com.frhnfath.penakde.view.birth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.frhnfath.penakde.view.CameraActivity
import com.frhnfath.penakde.R
import com.frhnfath.penakde.databinding.ActivityBirth2Binding

class BirthActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityBirth2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirth2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setTitle(R.string.ktp_orang_tua)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnContinue.setOnClickListener {
            val intent = Intent(this, BirthActivity3::class.java)
            startActivity(intent)
        }

        binding.btnCameraAyah.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }

        binding.btnCameraIbu.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
}