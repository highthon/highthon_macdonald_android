package com.example.di

import com.yongjincompany.data.repository.AuthRepositoryImpl
import com.yongjincompany.data.repository.QuestionRepositoryImpl
import com.yongjincompany.domain.repository.AuthRepository
import com.yongjincompany.domain.repository.QuestionRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun providesRemoteAuthRepository(
        authRepositoryImpl: AuthRepositoryImpl
    ): AuthRepository

    @Binds
    abstract fun providesRemoteQuestionRepository(
        questionRepositoryImpl: QuestionRepositoryImpl
    ): QuestionRepository
}
