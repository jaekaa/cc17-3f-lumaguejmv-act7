package com.example.mycityapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycityapp.CoffeeShop
import com.example.mycityapp.R
import com.example.mycityapp.adapters.CoffeeShopAdapter
import com.example.mycityapp.viewmodels.CoffeeShopsViewModel

class CoffeeShopsActivity : AppCompatActivity() {
    private lateinit var viewModel: CoffeeShopsViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CoffeeShopAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_shops)

        recyclerView = findViewById(R.id.recyclerViewCoffeeShops)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = CoffeeShopAdapter()
        recyclerView.adapter = adapter

        viewModel = ViewModelProvider(this).get(CoffeeShopsViewModel::class.java)
        viewModel.getCoffeeShops().observe(this, Observer<List<CoffeeShop>> { coffeeShopList ->
            coffeeShopList?.let { adapter.setCoffeeShops(it) }
        })
    }
}
