package com.example.leaderboardapp

import android.graphics.ColorSpace
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


/**
 * A simple [Fragment] subclass.

 */
class LearningLeaders : Fragment() {
    private val learnersList = ArrayList<ModelClass>()
    private lateinit var learnersAdapter: RecyclerAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_learning_leaders, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
       learnersAdapter = RecyclerAdapter(learnersList)
        recyclerView.itemAnimator = DefaultItemAnimator()
       val layoutManager = LinearLayoutManager(view.context)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = learnersAdapter
        prepareLearnersData()
    }
    private fun prepareLearnersData(){
        var movie = ModelClass("Mad Max: Fury Road", "Action & Adventure", "2015")
        learnersList.add(movie)
        movie = ModelClass("Inside Out", "Animation, Kids & Family", "2015")
        learnersList.add(movie)
        movie =  ModelClass("Star Wars: Episode VII - The Force Awakens", "Action", "2015")
       learnersList.add(movie)
        movie =  ModelClass("Shaun the Sheep", "Animation", "2015")
        learnersList.add(movie)
        movie =  ModelClass("The Martian", "Science Fiction & Fantasy", "2015")
        learnersList.add(movie)
        movie =  ModelClass("Mission: Impossible Rogue Nation", "Action", "2015")
        learnersList.add(movie)
        movie =  ModelClass("Up", "Animation", "2009")
        learnersList.add(movie)
        movie =  ModelClass("Star Trek", "Science Fiction", "2009")
        learnersList.add(movie)
        movie =  ModelClass("The LEGO MovieModel", "Animation", "2014")
        learnersList.add(movie)
        movie = ModelClass("Inside Out", "Animation, Kids & Family", "2015")
        learnersList.add(movie)
        movie =  ModelClass("Star Wars: Episode VII - The Force Awakens", "Action", "2015")
        learnersList.add(movie)
        movie =  ModelClass("Shaun the Sheep", "Animation", "2015")
        learnersList.add(movie)
        movie =  ModelClass("The Martian", "Science Fiction & Fantasy", "2015")
        learnersList.add(movie)
        movie =  ModelClass("Mission: Impossible Rogue Nation", "Action", "2015")
        learnersList.add(movie)
        movie =  ModelClass("Up", "Animation", "2009")
        learnersList.add(movie)
        movie =  ModelClass("Star Trek", "Science Fiction", "2009")
        learnersList.add(movie)
        movie =  ModelClass("The LEGO MovieModel", "Animation", "2014")
        learnersList.add(movie)
        learnersAdapter.notifyDataSetChanged()

    }
}


