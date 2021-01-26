package com.kei.odakapp.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kei.odakapp.R
import com.kei.odakapp.mentor.MentorActivity
import com.kei.odakapp.rank.GlobalRankActivity
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.btn_rank.setOnClickListener {
            val intent = Intent(context, GlobalRankActivity::class.java)
            startActivity(intent)
        }
        view.btn_mentor.setOnClickListener {
            val intent = Intent(context, MentorActivity::class.java)
            startActivity(intent)
        }
        return view
    }

    companion object {
        fun newInstance() : HomeFragment {
            val fragment = HomeFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}