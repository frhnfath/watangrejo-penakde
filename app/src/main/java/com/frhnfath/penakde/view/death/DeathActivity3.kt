package com.frhnfath.penakde.view.death

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.frhnfath.penakde.ConfirmationActivity
import com.frhnfath.penakde.R
import com.frhnfath.penakde.databinding.ActivityDeath3Binding
import com.frhnfath.penakde.view.CameraActivity

class DeathActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityDeath3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeath3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setTitle(R.string.jenazah)

        val spinnerGender: Spinner = binding.spinnerGender
        val spinnerReligion: Spinner = binding.spinnerReligion
        val spinnerDusun: Spinner = binding.spinnerDusun

        spinnerAdapter(spinnerGender, R.array.gender)
        spinnerAdapter(spinnerReligion, R.array.religions)
        spinnerAdapter(spinnerDusun, R.array.dusun)

        binding.btnContinue.setOnClickListener {
            val intent = Intent(this, ConfirmationActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.btnCameraSuketKematian.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }
    }

    private fun spinnerAdapter(spinner: Spinner, arr: Int) {
        ArrayAdapter.createFromResource(this, arr, android.R.layout.simple_spinner_dropdown_item
        ).also { arrayAdapter ->
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = arrayAdapter
        }
    }
}