package com.udacity.shoestore.details

import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class DetailsViewModel ():ViewModel()
{
    val shoe= Shoe()
    init {

    }

    override fun onCleared() {
        super.onCleared()
    }
}