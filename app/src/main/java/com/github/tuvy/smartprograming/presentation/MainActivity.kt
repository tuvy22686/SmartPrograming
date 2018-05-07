package com.github.tuvy.smartprograming.presentation

import android.os.Bundle
import com.github.tuvy.smartprograming.databinding.ActivityMainBinding
import com.github.tuvy.smartprograming.presentation.misc.BaseActivity
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

class MainActivity : BaseActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
//
//    fun setupRecyclerView() {
//        binding.recyclerView.adapter = GroupAdapter<ViewHolder>()
//
//    }
}