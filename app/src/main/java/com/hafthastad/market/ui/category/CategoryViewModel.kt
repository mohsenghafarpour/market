package com.hafthastad.market.ui.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hafthastad.market.base.BaseViewModel
import com.hafthastad.market.data.Category
import com.hafthastad.market.data.Stuff

class CategoryViewModel : BaseViewModel() {

    private val _categories = MutableLiveData<List<Category>>()
    val categories: LiveData<List<Category>>
        get() = _categories

    private val _stuffTitle = MutableLiveData<String>()
    val stuffTitle: LiveData<String>
        get() = _stuffTitle

    init {
        _categories.postValue(getListCategory())
    }

    fun setItemStuff(stuff: Stuff) {
        _stuffTitle.postValue(stuff.title)
    }

    private fun getListCategory(): List<Category> {
        return mutableListOf<Category>().apply {

            add(Category(0, "ورزشی", "#6abf69"))

            add(Category(1, "پوشاک", "#f57f17"))

            add(Category(2, "وسایل آشپزخانه", "#fdd835"))

            add(Category(3, "موسیقی", "#1976d2"))
        }
    }

}