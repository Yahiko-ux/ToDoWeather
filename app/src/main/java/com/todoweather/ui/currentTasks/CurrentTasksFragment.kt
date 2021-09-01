package com.todoweather.ui.currentTasks

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.todoweather.R
import com.todoweather.databinding.FragmentCurrentTasksBinding

class CurrentTasksFragment : Fragment(R.layout.fragment_current_tasks) {
    private val binding: FragmentCurrentTasksBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}

