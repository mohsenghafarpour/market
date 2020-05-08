package com.hafthastad.market.utils.ba

import android.graphics.Color
import androidx.databinding.BindingAdapter
import com.google.android.material.card.MaterialCardView

@BindingAdapter("backgroundColor")
fun MaterialCardView.setBackgroundColor(bc: String) {
    setCardBackgroundColor(Color.parseColor(bc))
}