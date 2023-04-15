package com.example.uts_Najwan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_najwan.mobil

class MobilAdapter (private val context: Context, private val mobil: List<mobil>, val listener: (mobil) -> Unit)
    : RecyclerView.Adapter<MobilAdapter.mobilViewHolder>(){
    class mobilViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgmobil = view.findViewById<ImageView>(R.id.img_item_photo)
        val namemobil = view.findViewById<TextView>(R.id.tv_item_name)
        val descmobil= view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(mobil: mobil, listener: (mobil) -> Unit){
            imgmobil.setImageResource(mobil.imgmobil)
            namemobil.text = mobil.namemobil
            descmobil.text = mobil.descmobil
            itemView.setOnClickListener{
                (listener(mobil))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mobilViewHolder {
        return mobilViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_anime, parent, false)
        )
    }

    override fun onBindViewHolder(holder: mobilViewHolder, position: Int) {
        holder.bindView(mobil[position], listener)
    }

    override fun getItemCount(): Int = mobil.size

}
