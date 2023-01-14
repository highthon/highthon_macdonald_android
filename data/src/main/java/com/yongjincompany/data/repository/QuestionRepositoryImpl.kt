package com.yongjincompany.data.repository

import com.yongjincompany.data.remote.datasource.QuestionDataSource
import com.yongjincompany.data.remote.response.question.CategoryQuestionResponse
import com.yongjincompany.data.util.OfflineCacheUtil
import com.yongjincompany.domain.entity.question.CategoryQuestionEntity
import com.yongjincompany.domain.enums.CategoryType
import com.yongjincompany.domain.repository.QuestionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class QuestionRepositoryImpl @Inject constructor(
    private val questionDataSource: QuestionDataSource
) : QuestionRepository {
    override suspend fun fetchCategoryQuestion(categoryType: CategoryType): Flow<CategoryQuestionEntity> =
        OfflineCacheUtil<CategoryQuestionEntity>()
            .remoteData { questionDataSource.fetchCategoryQuestion(categoryType).toEntity() }
            .createRemoteFlow()

    private fun CategoryQuestionResponse.toEntity() =
        CategoryQuestionEntity(
            question = question.map { it.toEntity() }
        )

    private fun CategoryQuestionResponse.Answer.toEntity() =
        CategoryQuestionEntity.Answer(
            id = id,
            comment = comment,
        )

    private fun CategoryQuestionResponse.Question.toEntity() =
        CategoryQuestionEntity.Question(
            id = id,
            title = title,
            content = content,
            user = user,
            category = category,
            likes = likes,
            answers = answers.map { it.toEntity() }
        )
}