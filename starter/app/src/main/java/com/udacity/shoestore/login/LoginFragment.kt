package com.udacity.shoestore.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
   lateinit var fragmentLoginBinding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentLoginBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
        //fragmentLoginBinding.next.setExpanded(false)

        fragmentLoginBinding.create.setOnClickListener(View.OnClickListener {

            if(fragmentLoginBinding.emailText.text.toString()!="" && fragmentLoginBinding.emailText.text.toString()!="")
            {
                fragmentLoginBinding.next.visibility=View.VISIBLE
            }
        })

        fragmentLoginBinding.next.setOnClickListener({
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
        })
        return fragmentLoginBinding.root
    }

    
}