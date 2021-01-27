package com.kei.odakapp.planner

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.kei.odakapp.R
import com.kei.odakapp.task.AddTaskActivity


class PlannerFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_planner, container, false)

        val fab = view.findViewById(R.id.fab_add) as FloatingActionButton
        fab.setOnClickListener {
            Intent(context, AddTaskActivity::class.java).also {
                startActivity(it)
            }
        }
        return view
    }

    companion object
}