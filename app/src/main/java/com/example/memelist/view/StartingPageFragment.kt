package com.example.memelist.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.memelist.databinding.FragmentStartingPageBinding

class StartingPageFragment: ViewModelFragment() {
    lateinit var binding: FragmentStartingPageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartingPageBinding.inflate(layoutInflater)

        binding.btnMemeList.setOnClickListener {
           viewModel.shouldLoadId = false
            viewModel.setLoading()
            findNavController().navigate(
                StartingPageFragmentDirections.actionStartingPageToMemeList()
            )

        }

        binding.btnMemeId.setOnClickListener {
            viewModel.shouldLoadId = true
            viewModel.setLoading()
            findNavController().navigate(
                StartingPageFragmentDirections.actionStartingPageToMemeDetails(
                    null,
                    binding.etIdInput.text.toString().toInt()
                )
            )
        }
        return binding.root
    }

}