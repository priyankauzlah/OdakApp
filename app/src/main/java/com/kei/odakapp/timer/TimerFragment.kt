package com.kei.odakapp.timer

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kei.odakapp.R
import com.kei.odakapp.rank.GlobalRankActivity
import kotlinx.android.synthetic.main.fragment_timer.*

class TimerFragment : Fragment() {
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
        val rootView: View = inflater.inflate(R.layout.fragment_timer, container, false)

        btn_timer.setOnClickListener {
            val intent = Intent(context, FocusTimerActivity::class.java)
            startActivity(intent)
        }
        return rootView
    }

    companion object {
        fun newInstance() : TimerFragment {
            val fragment = TimerFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}