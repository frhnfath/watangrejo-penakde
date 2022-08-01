package com.frhnfath.penakde.view.death

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.frhnfath.penakde.R
import com.frhnfath.penakde.databinding.ActivityDeath3Binding

class DeathActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityDeath3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeath3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val spinnerGender: Spinner = binding.spinnerGender
        val spinnerReligion: Spinner = binding.spinnerReligion
        ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_spinner_dropdown_item
        ).also { arrayAdapter ->
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerGender.adapter = arrayAdapter
        }
        ArrayAdapter.createFromResource(this, R.array.religions, android.R.layout.simple_spinner_dropdown_item
        ).also { arrayAdapter ->
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerReligion.adapter = arrayAdapter
        }
    }
}