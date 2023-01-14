package com.yongjincompany.app.feature.question.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentSocialLifeBinding
import com.yongjincompany.app.dummy.Question
import com.yongjincompany.app.feature.question.view.adapter.SocialLifeAdapter
import com.yongjincompany.app.util.BaseFragment

class SocialLifeFragment : BaseFragment<FragmentSocialLifeBinding>(
    R.layout.fragment_social_life
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
                "이호",
                "부장님이 저를 괴롭혀요",
                "들고 있는 볼펜으로 부장님 머리를 찍으면 좋습니다~",
                28,
                20,
                3021
            ),
            Question(
                R.drawable.ic_100tb,
                "일론 마스크",
                "팀장님과 은밀한 사내연애, 안 들키고 싶어요",
                "그럼 퇴사하십쇼",
                99999,
                123,
                65
            ),
            Question(
                R.drawable.ic_100tb,
                "이지터미스",
                "18살에 이 세계 삼성 회장?",
                "꿈입니다. 일어나세요",
                9999,
                23,
                87
            ),
            Question(
                R.drawable.ic_100tb,
                "하하",
                "빌게이츠가 사회생활 하는 법",
                "매일 도넛을 사다 부장님 머리에 꽂는다.",
                65,
                34,
                34
            )
        )
        val myAdapter by lazy {
            SocialLifeAdapter(questionList)
        }

        binding.rvQuestion.adapter = myAdapter
        binding.rvQuestion.layoutManager = LinearLayoutManager(context)
    }
}