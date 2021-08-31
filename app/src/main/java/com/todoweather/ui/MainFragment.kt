package com.todoweather.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.todoweather.R
import com.todoweather.databinding.FragmentMainBinding
import java.lang.IllegalStateException

class MainFragment : Fragment(R.layout.fragment_main) {
    private val binding: FragmentMainBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewPager2.adapter = activity?.let { ViewPager2Adapter(it) }
        val tabs: TabLayout = binding.tabLayout

        TabLayoutMediator(tabs, binding.viewPager2) { tab, position ->
            tab.text = when (position) {
                0 -> "Текущие задачи"
                1 -> "Выполненные задачи"
                else -> throw IllegalStateException()
            }
        }.attach()
    }
}
