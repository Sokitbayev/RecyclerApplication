package com.example.recyclerapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter

class ItemAdapter(
    private val onItemClick: (ItemData) -> Unit
) : ListAdapter<ItemData, ItemViewHolder>(ItemDiffUtils()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)

        return ItemViewHolder(view, onItemClick)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(currentList[position])
    }


}