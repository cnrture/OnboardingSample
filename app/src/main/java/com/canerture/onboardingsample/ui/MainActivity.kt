package com.canerture.onboardingsample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.canerture.onboardingsample.databinding.ActivityMainBinding
import com.canerture.onboardingsample.common.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}