package com.example.wishlist

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishListAdapter(private val items: List<WishLishItem>) : RecyclerView.Adapter<WishListAdapter.ViewHolder>(){


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val itemNameTextView: TextView
        val priceTextView: TextView
        val urlTextView: TextView
        init {
            // TODO: Store each of the layout's views into
            // the public final member variables created above
            itemNameTextView = itemView.findViewById(R.id.name)
            priceTextView = itemView.findViewById(R.id.price)
            urlTextView = itemView.findViewById(R.id.url)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val wishListView = inflater.inflate(R.layout.wishlist, parent, false)
        // Return a new holder instance
        return ViewHolder(wishListView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val wishListItem = items.get(position)
//        Log.d(wishListItem.itemName, "message")
        holder.itemNameTextView.text = wishListItem.itemName
        holder.priceTextView.text = wishListItem.price
        holder.urlTextView.text = wishListItem.url
    }

    override fun getItemCount(): Int {
        return items.size
    }
}