package com.example.victor.trainingapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_item.view.*

/**
 * Created by victor on 8/4/17.
 */

class ItemsAdapter(val items: List<Item>, val listener: (Item) -> Unit) : RecyclerView.Adapter<ItemsAdapter.Viewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(parent.inflate(R.layout.view_item))
    }

//    override fun onBindViewHolder(holder: Viewholder, position: Int) {
//        with(holder.itemView) {
//            txt_title.text = items[position].title
//            item_image.loadUrl(items[position].url)
//        }
////        holder.itemView.item_image.txt_title.text = items[position].title
////        holder.itemView.item_image.item_image.loadUrl(items[position].url)
//    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) = with(holder.itemView) {
        val item = items[position]
        txt_title.text = item.title
        item_image.loadUrl(item.url)
        setOnClickListener { listener(item) }
    }

    override fun getItemCount(): Int = items.size



    class Viewholder(view: View) : RecyclerView.ViewHolder(view)
}