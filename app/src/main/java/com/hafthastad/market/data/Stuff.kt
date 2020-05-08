package com.hafthastad.market.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Stuff(
    val id: Int,
    val title: String,
    val categoryColor: String
) : Parcelable