package com.udacity.shoestore.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {

    private lateinit var detailsBinding: FragmentDetailsBinding
    private lateinit var detailsViewModel:DetailsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        detailsBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_details,container,false)
        detailsViewModel=ViewModelProvider(this).get(DetailsViewModel::class.java)
        detailsBinding.shoe=detailsViewModel

        detailsBinding.add.setOnClickListener {
            findNavController().navigate(DetailsFragmentDirections.actionDetailsFragmentToShoesFragment(detailsViewModel.shoe))
        }
        detailsBinding.back.setOnClickListener {

            findNavController().navigate(DetailsFragmentDirections.actionDetailsFragmentToShoesFragment(null))
        }



        return detailsBinding.root
    }


}