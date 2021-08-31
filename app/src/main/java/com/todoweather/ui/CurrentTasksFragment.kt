package com.todoweather.ui

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.constraintlayout.motion.widget.OnSwipe
import by.kirich1409.viewbindingdelegate.viewBinding
import com.todoweather.R
import com.todoweather.databinding.FragmentCurrentTasksBinding
import java.lang.Math.abs


class CurrentTasksFragment : Fragment(R.layout.fragment_current_tasks) {
    private val binding: FragmentCurrentTasksBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}

