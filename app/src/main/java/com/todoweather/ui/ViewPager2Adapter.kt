package com.todoweather.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.todoweather.ui.completedTasks.CompletedTasksFragment
import com.todoweather.ui.currentTasks.CurrentTasksFragment
import java.lang.IllegalStateException

class ViewPager2Adapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CurrentTasksFragment()
            1 -> CompletedTasksFragment()
            else -> throw IllegalStateException()
        }
    }
}