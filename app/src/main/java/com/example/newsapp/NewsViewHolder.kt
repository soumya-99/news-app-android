package com.example.newsapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleView: TextView = itemView.findViewById(R.id.title)
}