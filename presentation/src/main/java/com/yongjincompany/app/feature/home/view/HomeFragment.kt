package com.yongjincompany.app.feature.home.view

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentHomeBinding
import com.yongjincompany.app.feature.MainActivity
import com.yongjincompany.app.feature.question.view.FinanceFragment
import com.yongjincompany.app.util.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(
    R.layout.fragment_home
) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun initView() {
        super.initView()

        binding.ivFinance.setOnClickListener {
            val mainActivity = activity as MainActivity


            mainActivity.supportFragmentManager.beginTransaction()
                .replace(R.id.mainContainer, FinanceFragment())
                .addToBackStack("d")
                .commit()
        }

    }
}