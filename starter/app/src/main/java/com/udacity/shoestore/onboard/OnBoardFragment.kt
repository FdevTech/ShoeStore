package com.udacity.shoestore.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentOnBoardBinding


class OnBoardFragment : Fragment() {

    private lateinit var onBoardBinding: FragmentOnBoardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        onBoardBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_on_board,container,false)
        onBoardBinding.next.setOnClickListener {

            findNavController().navigate(OnBoardFragmentDirections.actionOnBoardFragmentToShoesFragment())
        }

        return onBoardBinding.root
    }


}