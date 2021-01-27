package com.kei.odakapp.timer

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kei.odakapp.R
import kotlinx.android.synthetic.main.fragment_timer.view.*

class TimerFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_timer, container, false)

        view.btn_timer.setOnClickListener {
            val intent = Intent(context, FocusTimerActivity::class.java)
            startActivity(intent)
        }
        return view
    }

    companion object
}