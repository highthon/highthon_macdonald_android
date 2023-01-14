package com.yongjincompany.app.feature

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ActivityMainBinding
import com.yongjincompany.app.feature.article.view.ArticleFragment
import com.yongjincompany.app.feature.home.view.HomeFragment
import com.yongjincompany.app.feature.question.view.QuestionFragment
import com.yongjincompany.app.util.BaseActivity


class MainActivity : BaseActivity<ActivityMainBinding>(
    R.layout.activity_main
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initNavigationBar()
    }

    private fun initNavigationBar() {
        binding.bottomNavigationView.run {
            setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.menu_article -> {
                        changeFragment(ArticleFragment())
                    }

                    R.id.menu_home -> {
                        changeFragment(HomeFragment())
                    }

                    R.id.menu_question -> {
                        changeFragment(QuestionFragment())
                    }
                }
                true
            }
            selectedItemId = R.id.menu_home
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.mainContainer.id, fragment).commit()
    }
}