package com.kei.odakapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kei.odakapp.chat.ChatFragment
import com.kei.odakapp.home.HomeFragment
import com.kei.odakapp.planner.PlannerFragment
import com.kei.odakapp.profile.ProfileFragment
import com.kei.odakapp.timer.TimerFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId){
            R.id.navigation_home -> {
                val fragment = HomeFragment.newInstance()
                implementFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_chat -> {
                val fragment = ChatFragment()
                implementFragment(fragment)
                return@OnNavigationItemSelectedListener  true
            }
            R.id.navigation_timer -> {
                val fragment = TimerFragment()
                implementFragment(fragment)
                return@OnNavigationItemSelectedListener  true
            }
            R.id.navigation_planner -> {
                val fragment = PlannerFragment()
                implementFragment(fragment)
                return@OnNavigationItemSelectedListener  true
            }
            R.id.navigation_profile -> {
                val fragment = ProfileFragment()
                implementFragment(fragment)
                return@OnNavigationItemSelectedListener  true
            }
        }
        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        home_nav.selectedItemId = R.id.navigation_home
        home_nav.setOnNavigationItemSelectedListener (mOnNavigationItemSelectedListener)
        val fragment = HomeFragment.newInstance()
        implementFragment(fragment)
    }
    private fun implementFragment (fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.content_main, fragment, fragment.javaClass.simpleName)
            .commit()
    }
}