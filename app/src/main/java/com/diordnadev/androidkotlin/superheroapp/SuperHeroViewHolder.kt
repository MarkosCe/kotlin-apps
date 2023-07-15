package com.diordnadev.androidkotlin.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.diordnadev.androidkotlin.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(superheroItemResponse: SuperheroItemResponse, onItemSelected:(String) -> Unit){
        binding.tvSuperheroName.text =  superheroItemResponse.name
        Picasso.get().load(superheroItemResponse.image.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener { onItemSelected(superheroItemResponse.id) }
    }

}