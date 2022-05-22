package com.example.recyclerapplication

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item.view.*

class ItemViewHolder(
    itemView: View,
    private val onItemClick: (ItemData) -> Unit
) : RecyclerView.ViewHolder(itemView) {

    private val titleText get() = itemView.layout_item_title
    private val checkBox get() = itemView.layout_item_check_box

    fun bind(item: ItemData) {
        titleText.text = item.title
        checkBox.isChecked = item.isChecked

        checkBox.setOnCheckedChangeListener { compoundButton, b ->
            onItemClick(item)
        }
    }
}