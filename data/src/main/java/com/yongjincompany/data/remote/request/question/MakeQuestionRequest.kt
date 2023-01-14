package com.yongjincompany.data.remote.request.question

import com.yongjincompany.domain.enums.CategoryType

data class MakeQuestionRequest(
    val title: String,
    val content: String,
    val categoryType: CategoryType
)