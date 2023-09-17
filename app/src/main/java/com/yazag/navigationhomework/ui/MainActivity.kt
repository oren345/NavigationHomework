package com.yazag.navigationhomework.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yazag.navigationhomework.R
import com.yazag.navigationhomework.common.viewBinding
import com.yazag.navigationhomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}