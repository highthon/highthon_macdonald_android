package com.yongjincompany.app.feature.auth

import android.content.Intent
import android.os.Bundle
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ActivityStartBinding
import com.yongjincompany.app.feature.auth.login.view.LoginActivity
import com.yongjincompany.app.feature.auth.register.view.RegisterActivity
import com.yongjincompany.app.util.BaseActivity

class StartActivity : BaseActivity<ActivityStartBinding>(
    R.layout.activity_start
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initView() {
        super.initView()

        binding.btnJoin.setOnClickListener {
            val intent = Intent(baseContext, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.tvLogin.setOnClickListener {
            val intent = Intent(baseContext, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}