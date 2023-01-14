package com.yongjincompany.app.feature.auth.register.view

import android.content.Intent
import android.os.Bundle
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ActivityRegisterBinding
import com.yongjincompany.app.feature.MainActivity
import com.yongjincompany.app.feature.auth.login.view.LoginActivity
import com.yongjincompany.app.util.BaseActivity

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(
    R.layout.activity_register
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun initView() {
        super.initView()

        binding.ibBack.setOnClickListener {
            finish()
        }

        binding.btnContinue.setOnClickListener {
            showShortToast("회원가입이 성공적으로 완료되었습니다")
            val intent = Intent(baseContext, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}