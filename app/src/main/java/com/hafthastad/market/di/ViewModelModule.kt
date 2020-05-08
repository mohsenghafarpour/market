package com.hafthastad.market.di

import com.hafthastad.market.ui.category.CategoryViewModel
import com.hafthastad.market.ui.home.HomeViewModel
import com.hafthastad.market.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel() }
    viewModel { HomeViewModel() }
    viewModel { CategoryViewModel() }
}