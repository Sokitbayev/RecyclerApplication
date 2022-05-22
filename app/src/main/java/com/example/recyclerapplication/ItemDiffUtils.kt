package com.example.recyclerapplication

import androidx.recyclerview.widget.DiffUtil

class ItemDiffUtils : DiffUtil.ItemCallback<ItemData>() {

    override fun areItemsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
        return oldItem.title == newItem.title
                && oldItem.isChecked == newItem.isChecked
    }

    override fun areContentsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
        return oldItem == newItem
    }
}