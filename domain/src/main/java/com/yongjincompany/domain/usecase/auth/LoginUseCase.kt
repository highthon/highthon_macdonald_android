package com.yongjincompany.domain.usecase.auth

import com.yongjincompany.domain.param.LoginParam
import com.yongjincompany.domain.repository.AuthRepository
import com.yongjincompany.domain.usecase.UseCase
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val authRepository: AuthRepository
) : UseCase<LoginParam, Unit>() {
    override suspend fun execute(data: LoginParam) =
        authRepository.login(data)
}