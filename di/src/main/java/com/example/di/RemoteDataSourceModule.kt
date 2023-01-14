package com.example.di

import com.yongjincompany.data.remote.datasource.AuthDataSource
import com.yongjincompany.data.remote.datasource.AuthDataSourceImpl
import com.yongjincompany.data.remote.datasource.QuestionDataSource
import com.yongjincompany.data.remote.datasource.QuestionDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {
    @Binds
    abstract fun provideRemoteAuthDataSource(
        authDataSourceImpl: AuthDataSourceImpl
    ): AuthDataSource

    @Binds
    abstract fun provideRemoteQuestionDataSource(
        questionDataSourceImpl: QuestionDataSourceImpl
    ): QuestionDataSource
}
