package com.yongjincompany.data.remote.api

import com.yongjincompany.data.remote.request.question.MakeQuestionRequest
import com.yongjincompany.data.remote.response.question.CategoryQuestionResponse
import com.yongjincompany.domain.enums.CategoryType
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface QuestionApi {
    @POST("/question")
    suspend fun makeQuestion(
        makeQuestionRequest: MakeQuestionRequest
    )

    @GET("/question")
    suspend fun fetchCategoryQuestion(
        @Query ("category") Category: CategoryType
    ) : CategoryQuestionResponse

}