package com.yongjincompany.app.feature.question.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentLawBinding
import com.yongjincompany.app.dummy.Question
import com.yongjincompany.app.feature.question.view.adapter.ETCAdapter
import com.yongjincompany.app.feature.question.view.adapter.LawAdapter
import com.yongjincompany.app.util.BaseFragment

class LawFragment : BaseFragment<FragmentLawBinding>(
    R.layout.fragment_law
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
                "변호사 우영우",
                "거꾸로 읽어도 우영우가 되는 마술 법 제대로 알자1",
                "거꾸로 읽어도 좋은 법 거꾸로 읽어도 윤삭연 뭐라는 건지 모르겠습니다. ",
                28,
                20,
                3021
            ),
            Question(
                R.drawable.ic_100tb,
                "보물지",
                "법인어떻게 내나요?",
                "국세청 가서 자수하면 법인을 줍니다(?)",
                2,
                123,
                65
            ),
            Question(
                R.drawable.ic_100tb,
                "이지 모터스",
                "2023년 바뀌는 법 알고 넘어가기!",
                "물품의 수출 또는 수입을 업으로 하고자 하는 자는 다른 법률에 특별한 규정이 있을 경우를 제외하고는 상공부장관의 허가를 받아야 한다.\n" +
                        "\n" +
                        "②제1항의 규정에 의한 허가를 받을 수 있는 요건 기타 필요한 사항은 대통령령으로 정한다. 다만, 자가생산품 또는 자가생산에 필요한 원료ㆍ시설이나 기계의 수출입업의 허가를 받을 수 있는 요건에 대하여는 대통령령이 정하는 바에 의하여 차등을 둘 수 있다. <개정 1975. 7. 25.>",
                3,
                23,
                87
            ),
            Question(
                R.drawable.ic_100tb,
                "하하",
                "빌게이츠가 되는 법",
                "없습니다. 허허",
                65,
                34,
                34
            )
        )
        val myAdapter by lazy {
            LawAdapter(questionList)
        }

        binding.rvQuestion.adapter = myAdapter
        binding.rvQuestion.layoutManager = LinearLayoutManager(context)
    }
}