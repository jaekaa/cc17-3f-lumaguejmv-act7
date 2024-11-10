package com.example.mycityapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.final2mycityapp.R
import com.example.final2mycityapp.Restaurant
import com.example.final2mycityapp.viewmodels.RestaurantsViewModel

class RestaurantAdapter(private val restaurants: List<Restaurant>) : RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {

    class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageViewRestaurant)
        val nameTextView: TextView = itemView.findViewById(R.id.textViewRestaurantName)
        val descriptionTextView: TextView = itemView.findViewById(R.id.textViewRestaurantDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_restaurant, parent, false) // Ensure the layout exists
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val restaurant = restaurants[position]
        holder.nameTextView.text = restaurant.name
        holder.descriptionTextView.text = restaurant.description
        holder.imageView.setImageResource(restaurant.imageResourceId)
    }

    override fun getItemCount(): Int {
        return restaurants.size
    }
}
