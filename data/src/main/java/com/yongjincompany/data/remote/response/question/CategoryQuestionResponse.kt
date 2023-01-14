package com.yongjincompany.data.remote.response.question

import com.yongjincompany.domain.enums.CategoryType

data class CategoryQuestionResponse(
    val question: List<Question>
) {
    data class Question(
        val id: Int,
        val title: String,
        val content: String,
        val user: String?,
        val category: CategoryType,
        val likes: Int,
        val answers: List<Answer>
    )

    data class Answer(
        val id: Int,
        val comment: String,
    )
}