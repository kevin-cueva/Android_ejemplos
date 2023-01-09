package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.example.recyclerview.SuperHeroPrivider
import com.example.recyclerview.adapter.SuperHeroAdapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initrecyclerView()
    }

    fun initrecyclerView(){
        val recyclerViwe = findViewById<RecyclerView>(R.id.recyclerSuperHero) //Recupera el id del recyclerView
        recyclerViwe.layoutManager = LinearLayoutManager(this)
        recyclerViwe.adapter = SuperHeroAdapter(SuperHeroPrivider.superHeroList)
        //SEPARADOR POR DEFECTO
        recyclerViwe.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
    }


}
