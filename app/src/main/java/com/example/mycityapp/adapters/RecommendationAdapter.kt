package com.example.mycityapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.final2mycityapp.R
import com.example.final2mycityapp.Recommendation

class RecommendationAdapter(private val recommendations: List<Recommendation>) :
    RecyclerView.Adapter<RecommendationAdapter.ViewHolder>() {

    // ViewHolder class that holds the item views
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.item_name)
        val itemDescription: TextView = itemView.findViewById(R.id.item_description)
    }

    // Inflating the item layout and creating ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recommendation, parent, false)
        return ViewHolder(view)
    }

    // Binding data to the item views
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recommendation = recommendations[position]
        holder.itemName.text = recommendation.name
        holder.itemDescription.text = recommendation.description
    }

    // Returning the size of the dataset
    override fun getItemCount(): Int {
        return recommendations.size
    }
}
