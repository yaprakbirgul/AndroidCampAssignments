package com.example.odev4navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class SayfaXFragment : Fragment(R.layout.fragment_sayfa_x) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.gotoY).setOnClickListener {
            findNavController().navigate(R.id.action_sayfaXFragment_to_sayfaYFragment)
        }
    }
}
