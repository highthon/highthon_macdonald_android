package com.yongjincompany.domain.repository

import com.yongjincompany.domain.param.LoginParam

interface AuthRepository {
    suspend fun login(loginParam: LoginParam)
}