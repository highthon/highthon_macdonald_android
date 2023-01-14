package com.yongjincompany.app.feature.question.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentFinanceBinding
import com.yongjincompany.app.dummy.Question
import com.yongjincompany.app.feature.question.view.adapter.ETCAdapter
import com.yongjincompany.app.feature.question.view.adapter.FinanceAdapter
import com.yongjincompany.app.util.BaseFragment

class FinanceFragment : BaseFragment<FragmentFinanceBinding>(
    R.layout.fragment_finance
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

        var questionList = mutableListOf(
            Question(
                R.drawable.ic_100tb,
                "쿠쿠쿡스",
                "비트코인 '인플라 둔화'에 2개월여만에 2만 달러 회복",
                "소셜트레이딩 플랫폼 알파임팩트의 헤이든 휴즈 최고경영자(CEO)는 \"물가지수 하락에 FTX 청산인들이 유동자산 50억 달러를 회수했다는 발표가 호재로 작용하고 있다\"며 \"시장은 다음 달 연방공개시장위원회(FOMC) 회의를 앞두고 많은 긍정적인 모멘텀을 가져가고 있다\"고 말했다.\n" +
                        "\n" +
                        "그러나 최근 랠리에 따른 추격 매수에 대해서는 신중한 반응도 나온다.\n" +
                        "\n" +
                        "시장 조사업체 페어리드 스트래티지스의 공동창업자 케이티 스턴턴은 \"비트코인이 1년 만에 200일 이동평균선을 넘었다\"며 \"현재 과매수가 몰린 상황에서 우리는 랠리를 쫓지는 않을 것\"이라고 말했다.",
                28,
                20,
                3021
            ),
            Question(
                R.drawable.ic_100tb,
                "쿠쿠섬",
                "도지코인의 미래?",
                "일론머스크가 뒤지지 않는 이상 도지코인은 오르지 않을껍니다.",
                99999,
                123,
                65
            ),
            Question(
                R.drawable.ic_100tb,
                "이지터미스",
                "아 18살에 비트코인 조지고 한강갑니다.",
                "잠시만요 아직 희망이 있습니다. 저는 심리학 박사. 이명철입니다. 지금 당장 저에게 전화 거십쇼 010 - 1111 - 1111 입니다. 제가 당신에게 동기부여를 해드리겠습니다. 연락 꼭 주세요. 당신은 아직 소중한 사람입니다.",
                3,
                23,
                87
            ),
            Question(
                R.drawable.ic_100tb,
                "하하",
                "빌게이츠가 되는 법",
                "저축 잘하면 됨",
                65,
                34,
                34
            )
        )
        val myAdapter by lazy {
            FinanceAdapter(questionList)
        }

        binding.rvQuestion.adapter = myAdapter
        binding.rvQuestion.layoutManager = LinearLayoutManager(context)
    }
}