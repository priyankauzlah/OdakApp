package com.kei.odakapp.chat

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kei.odakapp.R
import com.kei.odakapp.home.HomeFragment
import com.kei.odakapp.rank.GlobalRankActivity
import kotlinx.android.synthetic.main.fragment_chat.*
import kotlinx.android.synthetic.main.fragment_home.*

class ChatFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val rootView: View = inflater.inflate(R.layout.fragment_chat, container, false)
        rl_taylor.setOnClickListener {
            val intent = Intent(context, ChatActivity::class.java)
            startActivity(intent)
        }
        return rootView
    }

    companion object {
        fun newInstance() : ChatFragment {
            val fragment = ChatFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}