package com.yongjincompany.data.remote.datasource

import com.yongjincompany.data.remote.response.question.CategoryQuestionResponse
import com.yongjincompany.domain.enums.CategoryType

interface QuestionDataSource {
    suspend fun fetchCategoryQuestion(category: CategoryType): CategoryQuestionResponse
}