package com.frhnfath.penakde.view.birth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.frhnfath.penakde.R
import com.frhnfath.penakde.databinding.ActivityBirth4Binding

class BirthActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityBirth4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirth4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setTitle(R.string.baby)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val spinner: Spinner = binding.spinnerGender
        ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_spinner_dropdown_item
        ).also { arrayAdapter ->
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = arrayAdapter
        }
        binding.btnContinue.setOnClickListener {
            val intent = Intent(this, BirthActivity5::class.java)
            startActivity(intent)
        }
    }
}