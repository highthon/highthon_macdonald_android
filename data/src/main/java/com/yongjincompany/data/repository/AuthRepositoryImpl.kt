package com.yongjincompany.data.repository

import com.yongjincompany.data.local.datasource.LocalUserDataSource
import com.yongjincompany.data.remote.datasource.AuthDataSource
import com.yongjincompany.data.remote.request.auth.LoginRequest
import com.yongjincompany.data.remote.response.LoginResponse
import com.yongjincompany.domain.param.LoginParam
import com.yongjincompany.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val authDataSource: AuthDataSource,
    private val localUserDataSource: LocalUserDataSource,
) : AuthRepository {

    override suspend fun login(loginParam: LoginParam) {
        val response = authDataSource.login(loginParam.toRequest())
        saveAccount(loginParam)
        saveToken(response)
    }

    private suspend fun saveAccount(loginParam: LoginParam) {
        localUserDataSource.apply {
            setId(loginParam.email)
            setPw(loginParam.password)
        }
    }

    private suspend fun saveToken(loginResponse: LoginResponse) {
        localUserDataSource.apply {
            setAccessToken(loginResponse.accessToken)
            setRefreshToken(loginResponse.refreshToken)
        }
    }

    private fun LoginParam.toRequest() =
        LoginRequest(
            email = email,
            password = password,
        )
}