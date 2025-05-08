package com.example.odev4navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SayfaAFragment : Fragment(R.layout.fragment_sayfa_a) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.gotoB).setOnClickListener {
            findNavController().navigate(R.id.action_sayfaAFragment_to_sayfaBFragment)
        }
    }
}
