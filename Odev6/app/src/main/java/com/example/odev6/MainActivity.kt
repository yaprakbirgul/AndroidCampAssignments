package com.example.odev6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var urunAdapter: UrunAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 sütunlu grid

        val urunler = listOf(
            Urun("Süt", R.drawable.sut),
            Urun("Ekmek", R.drawable.ekmek),
            Urun("Domates", R.drawable.domates),
            Urun("Makarna", R.drawable.makarna)
        )

        urunAdapter = UrunAdapter(urunler)
        recyclerView.adapter = urunAdapter
    }
}
