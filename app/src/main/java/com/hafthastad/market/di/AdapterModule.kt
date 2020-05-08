package com.hafthastad.market.di

import com.hafthastad.market.ui.home.HomeAdapter
import org.koin.dsl.module

val adapterModule = module {
    factory { HomeAdapter() }
}