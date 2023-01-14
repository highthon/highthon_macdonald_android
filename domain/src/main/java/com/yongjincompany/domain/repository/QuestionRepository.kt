package com.yongjincompany.domain.repository

import com.yongjincompany.domain.entity.question.CategoryQuestionEntity
import com.yongjincompany.domain.enums.CategoryType
import kotlinx.coroutines.flow.Flow

interface QuestionRepository {
    suspend fun fetchCategoryQuestion(categoryType: CategoryType): Flow<CategoryQuestionEntity>
}