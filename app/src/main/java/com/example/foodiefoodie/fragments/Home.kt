package com.example.foodiefoodie.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.foodiefoodie.R
import com.example.foodiefoodie.databinding.FragmentHomeBinding

class Home : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel(R.drawable.burger, "The animal population decreased by 58 percent in 42 years."))
        imageList.add(SlideModel(R.drawable.fish, "Elephants and tigers may become extinct."))
        imageList.add(SlideModel(R.drawable.fries, "And people do that."))
        imageList.add(SlideModel(R.drawable.idli, "The animal population decreased by 58 percent in 42 years."))
        imageList.add(SlideModel(R.drawable.idli, "Elephants and tigers may become extinct."))
        imageList.add(SlideModel(R.drawable.prawn, "And people do that."))
        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList, ScaleTypes.FIT)

        imageSlider.setItemClickListener(object :ItemClickListener{
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                val itemPos=imageList[position]
                Toast.makeText(requireContext(), "$itemPos selected", Toast.LENGTH_SHORT).show()
            }
        })

    }
}