package com.example.leaderboardapp

import android.content.Context
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView


class Adapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                LearningLeaders()
            }
            1 -> {
                SkillLeaders()
        }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}