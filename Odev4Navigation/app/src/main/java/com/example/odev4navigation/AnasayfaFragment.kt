package com.example.odev4navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AnasayfaFragment : Fragment(R.layout.fragment_anasayfa) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.gotoA).setOnClickListener {
            findNavController().navigate(R.id.action_anasayfaFragment_to_sayfaAFragment)
        }

        view.findViewById<Button>(R.id.gotoX).setOnClickListener {
            findNavController().navigate(R.id.action_anasayfaFragment_to_sayfaXFragment)
        }
    }
}
