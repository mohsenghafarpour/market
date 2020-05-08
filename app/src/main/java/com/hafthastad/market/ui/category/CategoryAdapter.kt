package com.hafthastad.market.ui.category

import androidx.recyclerview.widget.DiffUtil
import com.hafthastad.market.R
import com.hafthastad.market.base.BaseAdapter
import com.hafthastad.market.data.Category

class CategoryAdapter : BaseAdapter<Category>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Category>() {
            override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_category
    }
}