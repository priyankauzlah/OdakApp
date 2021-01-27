package com.kei.odakapp.chat

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kei.odakapp.R
import kotlinx.android.synthetic.main.fragment_chat.view.*

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
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        view.rl_taylor.setOnClickListener {
            val intent = Intent(context, ChatActivity::class.java)
            startActivity(intent)
        }
        return view
    }

    companion object
}