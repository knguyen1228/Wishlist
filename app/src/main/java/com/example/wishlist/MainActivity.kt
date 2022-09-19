package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var wishList: MutableList<WishLishItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("BBBBB")

        val wishListRv = findViewById<RecyclerView>(R.id.wishListRv)
        val itemName = findViewById<TextView>(R.id.itemInput)
        val price = findViewById<TextView>(R.id.priceInput)
        val url = findViewById<TextView>(R.id.urlInput)


        wishList = ArrayList()

        val button = findViewById<Button>(R.id.submit)
        val adapter = WishListAdapter(wishList)

        wishListRv.adapter = adapter
        wishListRv.layoutManager = LinearLayoutManager(this)

        button.setOnClickListener {
            val wishListItem = WishLishItem(itemName.text.toString(), price.text.toString(), url.text.toString())
            wishList.add(wishListItem)
//            adapter = WishListAdapter(wishList)
            adapter.notifyItemInserted(wishList.size - 1)
            adapter.notifyDataSetChanged()
//            for (item in wishList) {
//                Log.d(item.itemName, "message")
//            }
//            print(wishList)
        }
        print("AAAAA")
        print(wishList)




    }
}