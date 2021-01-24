package com.kei.odakapp.planner

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kei.odakapp.R
import com.kei.odakapp.home.HomeFragment
import com.kei.odakapp.rank.GlobalRankActivity
import com.kei.odakapp.task.AddTaskActivity
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_planner.*


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
        val rootView: View = inflater.inflate(R.layout.fragment_planner, container, false)

        fab_add.setOnClickListener {
            val intent = Intent(context, AddTaskActivity::class.java)
            startActivity(intent)
        }
        return rootView
    }

    companion object {
        fun newInstance() : PlannerFragment {
            val fragment = PlannerFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}