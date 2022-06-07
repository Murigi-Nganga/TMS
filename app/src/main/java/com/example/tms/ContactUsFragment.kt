package com.example.tms

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tms.databinding.FragmentContactUsBinding

class ContactUsFragment : Fragment() {

    // Fragment Binding object
    private lateinit var binding: FragmentContactUsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentContactUsBinding.inflate(inflater, container, false)

        return binding.root
    }

}