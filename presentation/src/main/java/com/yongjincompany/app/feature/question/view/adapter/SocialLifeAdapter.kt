package com.yongjincompany.app.feature.question.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ItemQuestionBinding
import com.yongjincompany.app.dummy.Question

class SocialLifeAdapter(
    var questions: List<Question>,
) : RecyclerView.Adapter<SocialLifeAdapter.SocialLifeDataViewHolder>() {

    inner class SocialLifeDataViewHolder(val itemQuestionBinding: ItemQuestionBinding) :
        RecyclerView.ViewHolder(itemQuestionBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SocialLifeDataViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_question,
            parent,
            false
        )
    )

    override fun getItemCount() = questions.size

    override fun onBindViewHolder(holder: SocialLifeDataViewHolder, position: Int) {
        holder.itemQuestionBinding.tvFavorite.text = questions[position].favorite.toString()
        holder.itemQuestionBinding.tvUserName.text = questions[position].UserName
        holder.itemQuestionBinding.tvCommentCount.text = questions[position].comment.toString()
        holder.itemQuestionBinding.tvQuestionDetail.text = questions[position].contents
        holder.itemQuestionBinding.tvQuestion.text = questions[position].Title
        holder.itemQuestionBinding.tvInquiryCount.text = questions[position].open.toString()
        holder.itemQuestionBinding.tvRecommendCount.text = questions[position].favorite.toString()
    }
}