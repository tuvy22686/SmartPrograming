package com.github.tuvy.smartprograming.presentation

import android.os.Bundle
import com.github.tuvy.smartprograming.databinding.ActivityMainBinding
import com.github.tuvy.smartprograming.presentation.misc.BaseActivity

class MainActivity : BaseActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}