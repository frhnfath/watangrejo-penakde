package com.frhnfath.penakde.view.birth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frhnfath.penakde.databinding.ActivityBirth5Binding

class BirthActivity5 : AppCompatActivity() {

    private lateinit var binding: ActivityBirth5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirth5Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}