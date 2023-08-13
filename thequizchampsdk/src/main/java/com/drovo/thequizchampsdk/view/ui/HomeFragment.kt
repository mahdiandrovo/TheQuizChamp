package com.drovo.thequizchampsdk.view.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.drovo.thequizchampsdk.R

class HomeFragment : Fragment() {

    private lateinit var txtViwHome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val theInflater = inflater.inflate(R.layout.fragment_home, container, false)
        // Inflate the layout for this fragment

        txtViwHome = theInflater.findViewById(R.id.txtviwHome)

        txtViwHome.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_profile2Fragment)
        }

        return theInflater
    }
}