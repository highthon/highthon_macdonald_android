package com.yongjincompany.data.remote.api

import com.yongjincompany.data.remote.request.auth.LoginRequest
import com.yongjincompany.data.remote.response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("/user/login")
    suspend fun login(
        @Body loginRequest: LoginRequest
    ) : LoginResponse
}