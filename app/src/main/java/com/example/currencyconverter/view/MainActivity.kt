package com.example.currencyconverter.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.currencyconverter.R
import com.example.currencyconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTheme(R.style.splashScreenTheme)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
         setContentView(view)




    }
}