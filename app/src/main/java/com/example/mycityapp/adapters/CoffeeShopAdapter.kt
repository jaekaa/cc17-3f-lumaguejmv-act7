package com.example.mycityapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.final2mycityapp.CoffeeShop
import com.example.final2mycityapp.R
import com.example.final2mycityapp.viewmodels.CoffeeShopsViewModel

class CoffeeShopAdapter : RecyclerView.Adapter<CoffeeShopAdapter.CoffeeShopViewHolder>() {
    private var coffeeShops: List<CoffeeShop> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeShopViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_coffee_shops, parent, false)
        return CoffeeShopViewHolder(view)
    }

    override fun onBindViewHolder(holder: CoffeeShopViewHolder, position: Int) {
        val coffeeShop = coffeeShops[position]
        holder.bind(coffeeShop)
    }

    override fun getItemCount(): Int = coffeeShops.size

    fun setCoffeeShops(coffeeShops: List<CoffeeShop>) {
        this.coffeeShops = coffeeShops
        notifyDataSetChanged()
    }

    inner class CoffeeShopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageViewCoffeeShop)
        private val nameTextView: TextView = itemView.findViewById(R.id.textViewCoffeeShopName)
        private val descriptionTextView: TextView = itemView.findViewById(R.id.textViewCoffeeShopDescription)

        fun bind(coffeeShop: CoffeeShop) {
            nameTextView.text = coffeeShop.name
            descriptionTextView.text = coffeeShop.description
            imageView.setImageResource(coffeeShop.imageResId)
        }
    }
}
