package com.hafthastad.market.ui.category

import androidx.navigation.fragment.navArgs
import com.hafthastad.market.R
import com.hafthastad.market.base.BaseFragment
import com.hafthastad.market.databinding.FragmentCategoryBinding
import kotlinx.android.synthetic.main.fragment_category.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class CategoryFragment : BaseFragment<CategoryViewModel, FragmentCategoryBinding>() {

    override val viewModel: CategoryViewModel by viewModel()
    private val adapter: CategoryAdapter by inject()
    private val args: CategoryFragmentArgs by navArgs()

    override val layoutRes: Int = R.layout.fragment_category

    override fun configEvents() {
        list_category.adapter = adapter
        viewModel.setItemStuff(args.stuff)
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