package com.yongjincompany.app.feature.question.view

import android.os.Bundle
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ActivityPostQuestionBinding
import com.yongjincompany.app.util.BaseActivity

class PostQuestionActivity : BaseActivity<ActivityPostQuestionBinding>(
    R.layout.activity_post_question
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun initView() {
        super.initView()

        binding.btnDone.setOnClickListener {
            showShortToast("게시물을 작성하였습니다!")
            finish()
        }
    }
}