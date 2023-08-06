package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        binding.tvNumber.text = viewModel.myNumber.toString()

        binding.btnIncrement.setOnClickListener {
            viewModel.addNumber()
            binding.tvNumber.text = viewModel.myNumber.toString()
        }
    }
}