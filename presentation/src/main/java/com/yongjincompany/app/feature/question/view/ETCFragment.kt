package com.yongjincompany.app.feature.question.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentEtcBinding
import com.yongjincompany.app.dummy.Question
import com.yongjincompany.app.feature.question.view.adapter.ETCAdapter
import com.yongjincompany.app.util.BaseFragment

class ETCFragment : BaseFragment<FragmentEtcBinding>(
    R.layout.fragment_etc
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
                "이진법",
                "하, Frontend 개발자형들!",
                "몇명만 더 보면 50명이 넘으려나? 연말부터 회사로 들어오는 개발자 이력서를 하나하나씩 검토하고 있는데 이게 일이 쉽지는 않다. 개발자분의 능력을 달랑 1~2장짜리 이력서 페이지만 가지고 확인 할 수 없다. 시간을 내서 이력서에 적힌 Github 계정에 가서 코드도 보고, 포트폴리오에 적어주신 프로젝트들도 실행해보고, 개인블로그에 적힌 글들도 읽어보고 그러려면 1명당 못해도 15분, 길면 30분이 넘게 걸리는 일이 된다.\n" +
                        "\n" +
                        "30분이 길다고 투덜대었지만, 사실 이력서를 내신 분들은 이것보다 몇배는 더 많은 시간을 썼을거라 생각한다. 그렇게 정성것 만든 이력서를 보다가 공통으로 꼭 말해주고 싶은 답답한 구석이 있어서 이 글을 쓰게 되었다. 특히 Frontend 개발하는 분들에게, 딱 3가지만 말해주고 싶다.",
                102,
                12,
                1232
            ),
            Question(
                R.drawable.ic_100tb,
                "젤리113",
                "뭐든지 물어보는 DUGE 개발후기",
                "AMA(Ask Me Anything)은 한국어로 번역하자면 '무엇이든 물어 보세요'정도 될 것입니다. 한국에서는 인스타그램에서 '무물'이라고 줄여서 인플루언서들이 진행하기도 합니다. DUGE는 이런 익명 Q&A를 도와주는 서비스입니다.",
                73,
                123,
                65
            ),
            Question(
                R.drawable.ic_100tb,
                "이지터미스",
                "손목터널 증후군 걸렸어요 어케함?",
                "그냥 뜨거운 열에 30초간 100도씨로 조지면 해결됩니다. 고통이 없어져요.",
                1123,
                23,
                1231
            ),
            Question(
                R.drawable.ic_100tb,
                "하하",
                "빌게이츠가 되는 법",
                "사실 이렇게 포스트를 쓰기 전에 저의 DUGE 스페이스를 제 프로필 링크에 넣어 두었는데 어떻게 아셨는지 몇몇 분들이 가입해서 질문도 남겨 주시더군요.",
                65,
                34,
                34
            )
        )
        val myAdapter by lazy {
            ETCAdapter(questionList)
        }

        binding.rvQuestion.adapter = myAdapter
        binding.rvQuestion.layoutManager = LinearLayoutManager(context)
    }
}