package com.tega.usapresident

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PresidentAdapter(
    private val context: Context,
    private val usPresidents: List<UsPresident>,
    private val listener: (UsPresident) -> Unit
) : RecyclerView.Adapter<PresidentAdapter.ImageViewHolder>() {
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageSrc = view.findViewById<ImageView>(R.id._image)
        private val title = view.findViewById<TextView>(R.id._title)
               fun bindView(usPresident: UsPresident, listener: (UsPresident) -> Unit) {
            imageSrc.setImageResource(usPresident.imageSrc)
            title.text = usPresident.firstName
                       itemView.setOnClickListener { listener(usPresident) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_image, parent, false))

    override fun getItemCount(): Int = usPresidents.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(usPresidents[position], listener)
    }
}