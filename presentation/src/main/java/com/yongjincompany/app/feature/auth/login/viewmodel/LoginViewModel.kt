package com.yongjincompany.app.feature.auth.login.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yongjincompany.app.util.EventFlow
import com.yongjincompany.app.util.MutableEventFlow
import com.yongjincompany.app.util.asEventFlow
import com.yongjincompany.domain.param.LoginParam
import com.yongjincompany.domain.usecase.auth.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
) : ViewModel() {
    private val _loginEvent = MutableEventFlow<LoginEvent>()
    val loginEvent = _loginEvent.asEventFlow()

    fun login(loginParam: LoginParam) {
        viewModelScope.launch {
            kotlin.runCatching {
                loginUseCase.execute(loginParam)
            }.onSuccess {
                event(LoginEvent.SuccessLogin)
            }.onFailure {
                when (it) {
                    else -> event(LoginEvent.ErrorMessage("에러"))
                }
            }
        }
    }

    private fun event(event: LoginEvent) {
        viewModelScope.launch {
            _loginEvent.emit(event)
        }
    }

    sealed class LoginEvent() {
        object SuccessLogin : LoginEvent()
        data class ErrorMessage(val errorMessage: String) : LoginEvent()
    }
}