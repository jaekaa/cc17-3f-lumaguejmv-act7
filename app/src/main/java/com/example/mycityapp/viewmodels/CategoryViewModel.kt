package com.example.mycityapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CategoryViewModel : ViewModel() {
    // Example LiveData for categories; you can customize it as needed
    private val _categories = MutableLiveData<List<String>>()
    val categories: LiveData<List<String>> get() = _categories

    init {
        // Example data; replace with your actual categories
        _categories.value = listOf("Restaurants", "Parks", "Coffee Shops")
    }
}
