package com.yongjincompany.domain.usecase.question

import com.yongjincompany.domain.entity.question.CategoryQuestionEntity
import com.yongjincompany.domain.enums.CategoryType
import com.yongjincompany.domain.repository.QuestionRepository
import com.yongjincompany.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CategoryQuestionUseCase @Inject constructor(
    private val questionRepository: QuestionRepository
) : UseCase<CategoryType, Flow<CategoryQuestionEntity>>() {
    override suspend fun execute(data: CategoryType): Flow<CategoryQuestionEntity> =
        questionRepository.fetchCategoryQuestion(data)
}