package com.hafthastad.market.ui.home

import com.hafthastad.market.R
import com.hafthastad.market.base.BaseFragment
import com.hafthastad.market.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>() {

    override val viewModel: HomeViewModel by viewModel()
    private val adapter: HomeAdapter by inject()

    override val layoutRes: Int = R.layout.fragment_home

    override fun configEvents() {
        list_stuff.adapter = adapter
        adapter.onItemClicked = { stuff, _ ->
            viewModel.goToCategory(stuff)
        }
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