package com.example.leaderboardapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView

class IqAdapter (private val iqList:List<ModelClass>): RecyclerView.Adapter<IqAdapter.MyViewHolder2>() {

    inner class MyViewHolder2 (view: View) : RecyclerView.ViewHolder(view) {
        var title2: TextView = view.findViewById(R.id.learning_name)
        var year2: TextView = view.findViewById(R.id.learning_hours)
        var genre2: TextView = view.findViewById(R.id.learning)

    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder2 {
        val itemView2 = LayoutInflater.from(parent.context)
            .inflate(R.layout.iq_layout, parent, false)
        return MyViewHolder2(itemView2)
    }

    override fun onBindViewHolder(holder: MyViewHolder2, position: Int) {
        val list2 = iqList[position]
        holder.title2.text =list2.getTitle()
        holder.genre2.text = list2.getGenre()
        holder.year2.text = list2.getYear()
    }

    override fun getItemCount(): Int {
        return iqList.size
    }


}