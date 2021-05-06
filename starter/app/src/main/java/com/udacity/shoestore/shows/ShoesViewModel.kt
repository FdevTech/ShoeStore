package com.udacity.shoestore.shows

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
private const val TAG = "ShoesViewModel"
class ShoesViewModel ():ViewModel()
{

    val shoe= Shoe()
    private var _listOfShoes=MutableLiveData<ArrayList<Shoe>>()
    val listOfShoes:LiveData<ArrayList<Shoe>>
    get() = _listOfShoes
    val list= arrayListOf<Shoe>()


    init {

        _listOfShoes.value=list
    }

    fun addToTheList()
    {
        
        _listOfShoes.value!!.add(shoe)
        Log.d(TAG, "addToTheList: ${_listOfShoes.value!!.size}")

    }
    fun setList(list: ArrayList<Shoe>)
    {
        _listOfShoes.value=list
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "onCleared: ")
    }
}