package com.drovo.thequizchampsdk.view.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.drovo.thequizchampsdk.R

class ProfileFragment : Fragment() {

    private lateinit var textViwProfile: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val theInflater = inflater.inflate(R.layout.fragment_profile, container, false)

        textViwProfile = theInflater.findViewById(R.id.profileText)

        textViwProfile.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_profile2Fragment)
        }

        return theInflater
    }
}