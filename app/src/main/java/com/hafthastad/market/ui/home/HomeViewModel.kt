package com.hafthastad.market.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hafthastad.market.base.BaseViewModel
import com.hafthastad.market.data.Stuff

class HomeViewModel : BaseViewModel() {

    private val _stuffs = MutableLiveData<List<Stuff>>()
    val stuffs: LiveData<List<Stuff>>
        get() = _stuffs

    init {
        _stuffs.postValue(getListStuff())
    }

    private fun getListStuff(): List<Stuff> {
        return mutableListOf<Stuff>().apply {

            add(
                Stuff(
                    0,
                    "شلوار مردانه",
                    "#f57f17"
                )
            )

            add(
                Stuff(
                    1,
                    "کت تک",
                    "#f57f17"
                )
            )

            add(
                Stuff(
                    2,
                    "پیراهن مردانه",
                    "#f57f17"
                )
            )


            add(
                Stuff(
                    3,
                    "پیراهن زنانه",
                    "#f57f17"
                )
            )


            add(
                Stuff(
                    4,
                    "شلوار زنانه",
                    "#f57f17"
                )
            )


            add(
                Stuff(
                    5,
                    "توپ فوتبال",
                    "#6abf69"
                )
            )


            add(
                Stuff(
                    6,
                    "میز بیلیارد",
                    "#6abf69"
                )
            )


            add(
                Stuff(
                    7,
                    "توپ والیبال",
                    "#6abf69"
                )
            )


            add(
                Stuff(
                    8,
                    "چاقوی آشپزخانه",
                    "#fdd835"
                )
            )

            add(
                Stuff(
                    9,
                    "قابلمه 6 تکه",
                    "#fdd835"
                )
            )

            add(
                Stuff(
                    10,
                    "گیتار",
                    "#1976d2"
                )
            )

            add(
                Stuff(
                    11,
                    "پیانو",
                    "#1976d2"
                )
            )

            add(
                Stuff(
                    12,
                    "گیتار برقی",
                    "#1976d2"
                )
            )


        }
    }
}