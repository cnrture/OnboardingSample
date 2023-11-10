package com.canerture.onboardingsample.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.canerture.onboardingsample.R
import com.canerture.onboardingsample.databinding.FragmentHomeBinding
import com.canerture.onboardingsample.common.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}