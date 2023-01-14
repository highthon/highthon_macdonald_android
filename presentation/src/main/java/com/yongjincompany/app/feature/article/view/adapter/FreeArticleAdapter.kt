package com.yongjincompany.app.feature.article.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ItemArticleBinding
import com.yongjincompany.app.databinding.ItemQuestionBinding
import com.yongjincompany.app.dummy.Article
import com.yongjincompany.app.dummy.Question

class FreeArticleAdapter(
    var questions: List<Article>,
) : RecyclerView.Adapter<FreeArticleAdapter.FreeArticleDataViewHolder>() {

    inner class FreeArticleDataViewHolder(val itemArticleBinding: ItemArticleBinding) :
        RecyclerView.ViewHolder(itemArticleBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = FreeArticleDataViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_article,
            parent,
            false
        )
    )

    override fun getItemCount() = questions.size

    override fun onBindViewHolder(holder: FreeArticleDataViewHolder, position: Int) {
        holder.itemArticleBinding.tvFavoriteCount.text = questions[position].favorite.toString()
        holder.itemArticleBinding.tvUserName.text = questions[position].name
        holder.itemArticleBinding.tvInquiryCount.text = questions[position].open.toString()
        holder.itemArticleBinding.tvQuestionDetail.text = questions[position].contents
        holder.itemArticleBinding.tvQuestion.text = questions[position].title
    }
}