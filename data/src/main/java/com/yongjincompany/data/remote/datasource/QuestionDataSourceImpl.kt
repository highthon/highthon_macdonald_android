package com.yongjincompany.data.remote.datasource

import com.yongjincompany.data.remote.api.QuestionApi
import com.yongjincompany.data.remote.response.question.CategoryQuestionResponse
import com.yongjincompany.data.util.HttpHandler
import com.yongjincompany.domain.enums.CategoryType
import javax.inject.Inject

class QuestionDataSourceImpl @Inject constructor(
    private val questionApi: QuestionApi
) : QuestionDataSource {
    override suspend fun fetchCategoryQuestion(category: CategoryType) =
        HttpHandler<CategoryQuestionResponse>()
            .httpRequest { questionApi.fetchCategoryQuestion(category) }
            .sendRequest()
}