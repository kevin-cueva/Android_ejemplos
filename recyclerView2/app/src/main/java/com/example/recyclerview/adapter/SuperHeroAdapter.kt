package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.SuperHero

/*Esta clase es para tomar los elementos de la lista y adaptarlos al
* RecyclerView*/
class SuperHeroAdapter(private  val superHeroList:List<SuperHero>) : RecyclerView.Adapter<SuperHeroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        //Es el encargado de tomar el Layout en este caso se llama: item_superhero,darcelos al recycleViewHolder para que los pinte
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        //Pasa por la lista y llama al render de los superheroes
        val item = superHeroList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        //Devuelve el tamaño de la lista para uqe se vean todos los datos
        return superHeroList.size
    }
}