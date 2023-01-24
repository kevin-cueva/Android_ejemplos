package com.example.sport

import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class SportListAdapter(private var listener: OnClickListener):
    ListAdapter<Sport, RecyclerView.ViewHolder>(SportDiffCallbac()){


    class SportDiffCallbac : DiffUtil.ItemCallback<Sport>(){
        override fun areItemsTheSame(oldItem: Sport, newItem: Sport): Boolean = oldItem.id==newItem.id

        override fun areContentsTheSame(oldItem: Sport, newItem: Sport): Boolean = oldItem==newItem

    }
}