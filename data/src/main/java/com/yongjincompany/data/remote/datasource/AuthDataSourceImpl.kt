package com.yongjincompany.data.remote.datasource

import com.yongjincompany.data.remote.api.AuthApi
import com.yongjincompany.data.remote.request.auth.LoginRequest
import com.yongjincompany.data.remote.response.LoginResponse
import com.yongjincompany.data.util.HttpHandler
import javax.inject.Inject

class AuthDataSourceImpl @Inject constructor(
    private val authApi: AuthApi
) : AuthDataSource {

    override suspend fun login(
        loginRequest: LoginRequest,
    ) = HttpHandler<LoginResponse>()
        .httpRequest { authApi.login(loginRequest) }
        .sendRequest()
}