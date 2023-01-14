package com.yongjincompany.data.remote.datasource

import com.yongjincompany.data.remote.request.auth.LoginRequest
import com.yongjincompany.data.remote.response.LoginResponse

interface AuthDataSource {
    suspend fun login(loginRequest: LoginRequest): LoginResponse
}