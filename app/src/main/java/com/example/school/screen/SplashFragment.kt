package com.example.school.screen

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.school.R
import com.example.school.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSplashBinding.inflate(inflater, container, false)

        val animation = AnimationUtils.loadAnimation(requireContext(), R.anim.logo_anim)
        binding.splashLogo.startAnimation(animation)

        Handler(Looper.getMainLooper()).postDelayed({
            // TODO: Check for logged in user
            findNavController()
        }, 3000)

        return binding.root
    }
}