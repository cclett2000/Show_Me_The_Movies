package com.example.showmethemovies

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.showmethemovies.model.app_p1.RVModel

class RecyclerViewAdapter(private val itemList: MutableList<RVModel>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // holds list items
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_card_view_design, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = itemList[position]
        Glide.with(holder.itemView.context)
            .load("https://image.tmdb.org/t/p/w500/" + model.movieImgPath)
            .placeholder(R.drawable.cropped_placeholder)
            .fitCenter()
            .into(holder.movieImage)
        holder.movieName.text = model.movieName
        holder.movieOverview.text = model.movieOverview
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    // support class
    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        val movieImage: ImageView = ItemView.findViewById(R.id.movie_thumbnail)
        val movieName: TextView = itemView.findViewById(R.id.movie_title)
        val movieOverview: TextView = itemView.findViewById(R.id.movie_overview)
    }
}