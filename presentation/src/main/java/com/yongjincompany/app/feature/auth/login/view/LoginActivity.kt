package com.yongjincompany.app.feature.auth.login.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ActivityLoginBinding
import com.yongjincompany.app.feature.MainActivity
import com.yongjincompany.app.feature.auth.login.viewmodel.LoginViewModel
import com.yongjincompany.app.util.BaseActivity
import com.yongjincompany.app.util.repeatOnStarted
import com.yongjincompany.domain.param.LoginParam
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : BaseActivity<ActivityLoginBinding>(
    R.layout.activity_login
) {
    private val vm: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        repeatOnStarted {
            vm.loginEvent.collect { event -> handleEvent(event) }
        }
    }

    private fun handleEvent(event: LoginViewModel.LoginEvent) {
        when (event) {
            is LoginViewModel.LoginEvent.SuccessLogin -> {

            }

            is LoginViewModel.LoginEvent.ErrorMessage -> showShortToast(event.errorMessage)

        }
    }

    override fun initView() {
        super.initView()

        binding.ivBack.setOnClickListener {
            finish()
        }
        binding.btnLogin.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}