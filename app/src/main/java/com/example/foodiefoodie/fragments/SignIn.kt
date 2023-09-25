package com.example.foodiefoodie.fragments

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foodiefoodie.R
import com.example.foodiefoodie.databinding.FragmentSignInBinding

class SignIn : Fragment() {
lateinit var binding: FragmentSignInBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentSignInBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSignin.setOnClickListener {
            val email=binding.loginEmail.text
            val pass=binding.passwordLogin.text
            if (email.isNullOrEmpty()){
                binding.TILemail.error="Email cant be empty"
            }
            else{
                binding.TILemail.error=""
            }
            if (pass.isNullOrEmpty()){
                binding.TILpass.error="Password cant be empty"
            }

        }
    }
}