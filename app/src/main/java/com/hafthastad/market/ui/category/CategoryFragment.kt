package com.hafthastad.market.ui.category

import com.hafthastad.market.R
import com.hafthastad.market.base.BaseFragment
import com.hafthastad.market.databinding.FragmentCategoryBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CategoryFragment : BaseFragment<CategoryViewModel, FragmentCategoryBinding>() {

    override val viewModel: CategoryViewModel by viewModel()

    override val layoutRes: Int = R.layout.fragment_category

    override fun configEvents() {
    }

    override fun bindObservables() {
    }

    override fun initBinding() {
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            vm = viewModel
            executePendingBindings()
        }
    }
}