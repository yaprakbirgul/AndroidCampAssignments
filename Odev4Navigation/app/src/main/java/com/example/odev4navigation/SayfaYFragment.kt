package com.example.odev4navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.activity.addCallback

class SayfaYFragment : Fragment(R.layout.fragment_sayfa_y) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.backToHome).setOnClickListener {
            findNavController().navigate(R.id.action_sayfaYFragment_to_anasayfaFragment)
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().popBackStack(R.id.anasayfaFragment, false)
        }
    }
}
