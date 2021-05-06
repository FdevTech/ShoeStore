package com.udacity.shoestore.shows

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoesBinding
import com.udacity.shoestore.models.Shoe
import kotlin.math.log

private const val TAG = "ShoesFragment"
class ShoesFragment : Fragment() {

    private  val shoesViewModel:ShoesViewModel by activityViewModels()

    private lateinit var  fragmentShoesBinding: FragmentShoesBinding
    private var list= arrayListOf<Shoe>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentShoesBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_shoes,container,false)



       



        shoesViewModel.listOfShoes.observe(this.viewLifecycleOwner, Observer {
            Log.d(TAG, "onCreateView: ${it.size}")

            it.forEach({shoe->
                val text=TextView(activity)
                text.text=shoe.name
                fragmentShoesBinding.linearLayoutList.addView(text)
            })
        })

        fragmentShoesBinding.next.setOnClickListener {

            findNavController().navigate(ShoesFragmentDirections.actionShoesFragmentToDetailsFragment())
        }

        return fragmentShoesBinding.root
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState: ")
    }

}