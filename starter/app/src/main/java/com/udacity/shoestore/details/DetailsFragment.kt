package com.udacity.shoestore.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentDetailsBinding
import com.udacity.shoestore.shows.ShoesViewModel


class DetailsFragment : Fragment() {

    private lateinit var detailsBinding: FragmentDetailsBinding
    private lateinit var detailsViewModel:DetailsViewModel
    private val shoesViewModel: ShoesViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        detailsBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_details,container,false)



        detailsBinding.shoe=shoesViewModel

        detailsBinding.add.setOnClickListener {

             shoesViewModel.addToTheList()
            findNavController().navigate(DetailsFragmentDirections.actionDetailsFragmentToShoesFragment())
        }
        detailsBinding.back.setOnClickListener {

            findNavController().navigate(DetailsFragmentDirections.actionDetailsFragmentToShoesFragment())
        }



        return detailsBinding.root
    }


}