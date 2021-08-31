package com.todoweather.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.todoweather.databinding.FragmentWeatherBinding

class WeatherFragment : Fragment() {
    private val binding: FragmentWeatherBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}