package com.yongjincompany.app.feature.article.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ItemArticleBinding
import com.yongjincompany.app.databinding.ItemQuestionBinding
import com.yongjincompany.app.databinding.ItemRareArticleBinding
import com.yongjincompany.app.dummy.Article
import com.yongjincompany.app.dummy.Question

class PremiumArticleAdapter(
    var questions: List<Article>,
) : RecyclerView.Adapter<PremiumArticleAdapter.PremiumArticleDataViewHolder>() {

    inner class PremiumArticleDataViewHolder(val itemRareArticleBinding: ItemRareArticleBinding) :
        RecyclerView.ViewHolder(itemRareArticleBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        PremiumArticleDataViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_rare_article,
                parent,
                false
            )
        )

    override fun getItemCount() = questions.size

    override fun onBindViewHolder(holder: PremiumArticleDataViewHolder, position: Int) {
        holder.itemRareArticleBinding.tvFavoriteCount.text = questions[position].favorite.toString()
        holder.itemRareArticleBinding.tvUserName.text = questions[position].name
        holder.itemRareArticleBinding.tvInquiryCount.text = questions[position].open.toString()
        holder.itemRareArticleBinding.tvQuestionDetail.text = questions[position].contents
        holder.itemRareArticleBinding.tvQuestion.text = questions[position].title
    }
}