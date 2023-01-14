package com.yongjincompany.app.feature.article.view

import android.os.Bundle
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentArticleBinding
import com.yongjincompany.app.feature.MainActivity
import com.yongjincompany.app.util.BaseFragment

class ArticleFragment : BaseFragment<FragmentArticleBinding>(
    R.layout.fragment_article
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
        val mainActivity = activity as MainActivity

        mainActivity.supportFragmentManager.beginTransaction()
            .replace(R.id.articleContainer, FreeArticleFragment())
            .commit()

        binding.tabFree.setOnClickListener {
            mainActivity.supportFragmentManager.beginTransaction()
                .replace(R.id.articleContainer, FreeArticleFragment())
                .commit()
        }

        binding.tabPremium.setOnClickListener {
            mainActivity.supportFragmentManager.beginTransaction()
                .replace(R.id.articleContainer, PremiumArticleFragment())
                .commit()
        }

    }
}