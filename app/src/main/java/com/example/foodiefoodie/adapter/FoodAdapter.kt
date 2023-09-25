package com.example.foodiefoodie.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.example.foodiefoodie.databinding.HomeFoodRowBinding

class FoodAdapter(private val items:List<String>,private val price:List<String>,private val image:List<Int>):RecyclerView.Adapter<FoodAdapter.FoodVH>() {
    inner class FoodVH(val binding: HomeFoodRowBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodVH {
        return FoodVH(HomeFoodRowBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: FoodVH, position: Int) {
       val item=items[position]
        val image=image[position]
        val price=price[position]
        holder.binding.apply {
            homeRowImage.load(image){
                crossfade(enable = true)
                crossfade(3000)
                transformations(CircleCropTransformation())
            }
            homeRowPrice.text=price
            homeRowTitle.text=item
        }
    }
}