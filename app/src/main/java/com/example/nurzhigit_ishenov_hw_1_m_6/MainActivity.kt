package com.example.nurzhigit_ishenov_hw_1_m_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.nurzhigit_ishenov_hw_1_m_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel by lazy {
        ViewModelProvider(this)[CounterViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupOnclicklisteners()
        viewModel.counterData.observe(this){data->
            binding.tvResult.text = data.toString()
        }
    }

    private fun setupOnclicklisteners() {
        binding.apply {
            btnPlus.setOnClickListener {
                viewModel.onInc()
            }
            btnMinus.setOnClickListener {
                viewModel.onDec()
            }
        }
    }
}