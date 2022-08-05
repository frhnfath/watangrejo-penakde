package com.frhnfath.penakde.view.birth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.frhnfath.penakde.ConfirmationActivity
import com.frhnfath.penakde.R
import com.frhnfath.penakde.databinding.ActivityBirth5Binding

class BirthActivity5 : AppCompatActivity() {

    private lateinit var binding: ActivityBirth5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirth5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setTitle(R.string.ket_rumah_sakit)

        val spinnerBirth: Spinner = binding.spinnerBirth
        val spinnerDoctor: Spinner = binding.spinnerDoctor

        spinnerAdapter(spinnerBirth, R.array.kelahiran)
        spinnerAdapter(spinnerDoctor, R.array.penolong_kelahiran)

        binding.btnContinue.setOnClickListener {
            val intent = Intent(this, ConfirmationActivity::class.java)
            startActivity(intent)
            finish()
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