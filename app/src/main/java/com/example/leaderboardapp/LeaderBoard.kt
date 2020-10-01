package com.example.leaderboardapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Adapter
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import java.util.zip.Inflater

class LeaderBoard : AppCompatActivity() {


    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout
    private lateinit var sButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leader_board)

        viewPager = findViewById(R.id.pager)
        tabLayout = findViewById(R.id.tabs)
        sButton = findViewById<Button>(R.id.submitBttn)

        title = "LeaderBoard"
        tabLayout.addTab(tabLayout.newTab().setText("Learning Leaders"))
        tabLayout.addTab(tabLayout.newTab().setText("Skill Leaders"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = Adapter(
            this, supportFragmentManager,
            tabLayout.tabCount
        )
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }

            override fun onTabReselected(p0: TabLayout.Tab?) {

            }


        })
        sButton.setOnClickListener {
            val intent = Intent(this,Submit :: class.java)
            startActivity(intent)
        }
    }
}
