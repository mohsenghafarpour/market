package com.hafthastad.market.ui.home

import androidx.recyclerview.widget.DiffUtil
import com.hafthastad.market.R
import com.hafthastad.market.base.BaseAdapter
import com.hafthastad.market.data.Stuff

class HomeAdapter : BaseAdapter<Stuff>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Stuff>() {
            override fun areItemsTheSame(oldItem: Stuff, newItem: Stuff): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Stuff, newItem: Stuff): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_home
    }
}