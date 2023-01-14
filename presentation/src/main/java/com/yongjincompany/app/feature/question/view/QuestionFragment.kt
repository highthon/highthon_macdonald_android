package com.yongjincompany.app.feature.question.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentQuestionBinding
import com.yongjincompany.app.feature.MainActivity
import com.yongjincompany.app.feature.article.view.FreeArticleFragment
import com.yongjincompany.app.feature.article.view.PremiumArticleFragment
import com.yongjincompany.app.util.BaseFragment

class QuestionFragment : BaseFragment<FragmentQuestionBinding>(
    R.layout.fragment_question
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
            .replace(R.id.questionContainer, ETCFragment())
            .commit()

        binding.btnSocialLife.setOnClickListener {
            binding.btnSocialLife.setBackgroundResource(R.drawable.question_top_button_background_active)
            binding.btnLaw.setBackgroundResource(R.drawable.question_top_button_background)
            binding.btnEtc.setBackgroundResource(R.drawable.question_top_button_background)
            binding.btnFinance.setBackgroundResource(R.drawable.question_top_button_background)
            mainActivity.supportFragmentManager.beginTransaction()
                .replace(R.id.questionContainer, SocialLifeFragment())
                .commit()
        }

        binding.btnFinance.setOnClickListener {
            binding.btnSocialLife.setBackgroundResource(R.drawable.question_top_button_background)
            binding.btnLaw.setBackgroundResource(R.drawable.question_top_button_background)
            binding.btnEtc.setBackgroundResource(R.drawable.question_top_button_background)
            binding.btnFinance.setBackgroundResource(R.drawable.question_top_button_background_active)
            mainActivity.supportFragmentManager.beginTransaction()
                .replace(R.id.questionContainer, FinanceFragment())
                .commit()
        }

        binding.btnEtc.setOnClickListener {
            binding.btnSocialLife.setBackgroundResource(R.drawable.question_top_button_background)
            binding.btnLaw.setBackgroundResource(R.drawable.question_top_button_background)
            binding.btnEtc.setBackgroundResource(R.drawable.question_top_button_background_active)
            binding.btnFinance.setBackgroundResource(R.drawable.question_top_button_background)
            mainActivity.supportFragmentManager.beginTransaction()
                .replace(R.id.questionContainer, ETCFragment())
                .commit()
        }

        binding.btnLaw.setOnClickListener {
            binding.btnSocialLife.setBackgroundResource(R.drawable.question_top_button_background)
            binding.btnLaw.setBackgroundResource(R.drawable.question_top_button_background_active)
            binding.btnEtc.setBackgroundResource(R.drawable.question_top_button_background)
            binding.btnFinance.setBackgroundResource(R.drawable.question_top_button_background)
            mainActivity.supportFragmentManager.beginTransaction()
                .replace(R.id.questionContainer, LawFragment())
                .commit()
        }

        binding.btnMakeQuestion.setOnClickListener {
            val intent = Intent(context, PostQuestionActivity::class.java)
            startActivity(intent)
        }
    }
}