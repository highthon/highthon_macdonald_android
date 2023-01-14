package com.yongjincompany.app.feature.article.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentFreeArticleBinding
import com.yongjincompany.app.dummy.Article
import com.yongjincompany.app.feature.article.view.adapter.FreeArticleAdapter
import com.yongjincompany.app.util.BaseFragment

class FreeArticleFragment : BaseFragment<FragmentFreeArticleBinding>(
    R.layout.fragment_free_article
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

        var articleList = mutableListOf(
            Article(
                "김병지",
                "어떻게 하면 골키퍼가 100m 드리블을 할 수 있는지에 관하여..",
                "그때였다. 나는 심장이 뛰기 시작했고, 지금이 아니면 기회가 오지 않으리라 판단했다.. 지금이다! 지금이 기회이다!가즈아!!! 그렇게 난 갔고 국가대표팀에서 잘렸다.",
                28,
                20,
            ),
            Article(
                "쿠쿠섬",
                "도지코인의 미래?",
                "일론머스크가 뒤지지 않는 이상 도지코인은 오르지 않을껍니다.",
                1,
                123,
            ),
            Article(
                "이지터미스",
                "군대 면제 받는 법",
                "잠시만요 아직 희망이 있습니다. 철봉에서 무릎으로 착..지",
                3,
                23,
            ),
            Article(
                "하하",
                "빌게이츠가 되는 법",
                "저축 잘하면 됨",
                65,
                34,
            )
        )
        val myAdapter by lazy {
            FreeArticleAdapter(articleList)
        }

        binding.rvFree.adapter = myAdapter
        binding.rvFree.layoutManager = LinearLayoutManager(context)
    }

}