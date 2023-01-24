package com.example.crud_recyclerview_listadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.crud_recyclerview_listadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NombresAdapter.OnItemClickListener{

    var dataSet : MutableList<Nombre> = arrayListOf()
    lateinit var mAdaoter : NombresAdapter
    lateinit var binding:ActivityMainBinding

    var isEditar = false
    var posicionLista = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mAdaoter = NombresAdapter(this)
        binding.rvList.layoutManager = LinearLayoutManager(this)
        binding.rvList.adapter = mAdaoter

        binding.btnAddEdit.setOnClickListener {
            if (!isEditar){
                dataSet.add(Nombre(binding.etNombre.text.toString().trim()))
                mAdaoter.submitList(dataSet)
                mAdaoter.notifyDataSetChanged()

                binding.etNombre.setText((""))
            }else{
                dataSet[posicionLista].nombre = binding.etNombre.text.toString()
                posicionLista = -1
                isEditar = false
                mAdaoter.notifyDataSetChanged()

                binding.etNombre.setText("")
            }
        }
    }

    override fun onItemEditar(position: Int, item: Nombre) {
        isEditar = true
        posicionLista = position
        binding.etNombre.setText(item.nombre)
    }

    override fun onItemBorrar(position: Int) {
        dataSet.removeAt(position) // Elimina el item
        mAdaoter.submitList(dataSet) //Actualiza la lista
        mAdaoter.notifyDataSetChanged()//Avisa que hay un cambio

    }
}