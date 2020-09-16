package com.example.leaderboardapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter (private var myList: List<ModelClass>) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>(){
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var title: TextView = view.findViewById(R.id.learning_name)
        var year: TextView = view.findViewById(R.id.learning_hours)
        var genre: TextView = view.findViewById(R.id.learning)
    }

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_view, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val list = myList[position]
        holder.title.text =list.getTitle()
        holder.genre.text = list.getGenre()
        holder.year.text = list.getYear()
    }

    override fun getItemCount(): Int {
        return myList.size
    }

}