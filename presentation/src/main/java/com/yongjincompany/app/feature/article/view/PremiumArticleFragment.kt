package com.yongjincompany.app.feature.article.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentPremiumArticleBinding
import com.yongjincompany.app.dummy.Article
import com.yongjincompany.app.feature.article.view.adapter.FreeArticleAdapter
import com.yongjincompany.app.feature.article.view.adapter.PremiumArticleAdapter
import com.yongjincompany.app.util.BaseFragment

class PremiumArticleFragment : BaseFragment<FragmentPremiumArticleBinding>(
    R.layout.fragment_premium_article
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
                "이운재",
                "병지 선배를 이길 수 있었던 법.",
                "병지 선배는 병*이에요. 그냥 50m 드리블 하고 국가대표 잘릴 때부터 알아봤어요. 역시 저는 국가대표",
                28,
                20,
            ),
            Article(
                "한문철",
                "차 사고의 미래?",
                "어?어어? 박았네요 10대 빵~",
                96,
                123,
            ),
            Article(
                "이지터미스",
                "군대 면제 받는 법",
                "잠시만요 아직 희망이 있습니다. 철봉에서 무릎으로 착..지 하지만 애매하게 한쪽이 아니라 두 쪽다 하려면 더 높은곳에서..번지 점....프?저도 안해봐서 모르겠네요. .안전하게 철봉을 택하세요!",
                53,
                23,
            ),
            Article(
                "지지",
                "일론머스크처럼 사는 법",
                "바람피고, 돈 많이 벌고 화염방사기 쏘고, 도지코인과 결혼하면 됩니다.",
                65,
                34,
            )
        )
        val myAdapter by lazy {
            PremiumArticleAdapter(articleList)
        }

        binding.rvPremium.adapter = myAdapter
        binding.rvPremium.layoutManager = LinearLayoutManager(context)
    }

}