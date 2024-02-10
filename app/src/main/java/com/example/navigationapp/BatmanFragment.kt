package com.example.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.databinding.FragmentBatmanBinding
import com.example.navigationapp.databinding.FragmentSuperBinding

class BatmanFragment : Fragment() {

    private lateinit var binding: FragmentBatmanBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBatmanBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBatman.setOnClickListener {
            findNavController().navigate(R.id.capitanFragment2)
        }
    }

}