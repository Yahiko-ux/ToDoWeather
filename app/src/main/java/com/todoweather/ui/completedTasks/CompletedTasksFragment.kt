package com.todoweather.ui.completedTasks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.todoweather.R
import com.todoweather.databinding.FragmentCompletedTasksBinding

class CompletedTasksFragment : Fragment(R.layout.fragment_completed_tasks) {
    private val binding: FragmentCompletedTasksBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}