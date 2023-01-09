package com.example.recyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.recyclerview.R
import com.example.recyclerview.SuperHero




class SuperHeroViewHolder(view:View):ViewHolder(view) {

    val superHero = view.findViewById<TextView>(R.id.tvsuperHeroName)
    val realName = view.findViewById<TextView>(R.id.tvRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)

    val photo = view.findViewById<ImageView>(R.id.ivSuperHero)
    fun render(superHeroModel:SuperHero){
        //Accediendo a las vistas
        superHero.text = superHeroModel.syperHero
        realName.text = superHeroModel.realName
        publisher.text = superHeroModel.publisher
        //Libreria Glider
        Glide.with(photo.context).load(superHeroModel.photo).into(photo)

    }
}