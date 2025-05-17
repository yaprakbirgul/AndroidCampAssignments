package com.example.odev6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UrunAdapter(private val urunList: List<Urun>) :
    RecyclerView.Adapter<UrunAdapter.UrunViewHolder>() {

    class UrunViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val urunResim: ImageView = itemView.findViewById(R.id.imageView)
        val urunAd: TextView = itemView.findViewById(R.id.textViewName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UrunViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_urun, parent, false)
        return UrunViewHolder(view)
    }

    override fun onBindViewHolder(holder: UrunViewHolder, position: Int) {
        val urun = urunList[position]
        holder.urunAd.text = urun.ad
        holder.urunResim.setImageResource(urun.resimId)
    }

    override fun getItemCount(): Int = urunList.size
}
