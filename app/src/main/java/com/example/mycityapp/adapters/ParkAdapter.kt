package com.example.mycityapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.final2mycityapp.Park
import com.example.final2mycityapp.R
import com.example.final2mycityapp.viewmodels.ParksViewModel

class ParkAdapter(private val parks: List<Park>) : RecyclerView.Adapter<ParkAdapter.ParkViewHolder>() {

    class ParkViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageViewPark)
        val nameTextView: TextView = itemView.findViewById(R.id.textViewParkName)
        val descriptionTextView: TextView = itemView.findViewById(R.id.textViewParkDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_parks, parent, false) // Ensure the layout exists
        return ParkViewHolder(view)
    }

    override fun onBindViewHolder(holder: ParkViewHolder, position: Int) {
        val park = parks[position]
        holder.nameTextView.text = park.name
        holder.descriptionTextView.text = park.description
        holder.imageView.setImageResource(park.imageResourceId)
    }

    override fun getItemCount(): Int {
        return parks.size
    }
}
