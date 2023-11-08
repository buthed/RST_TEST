package com.tematihonov.rst_test.di

import com.tematihonov.rst_test.data.repositoryImpl.NetworkRepositoryImpl
import com.tematihonov.rst_test.domain.repository.NetworkRepository
import com.tematihonov.rst_test.domain.usecase.NetworkUseCase
import com.tematihonov.rst_test.domain.usecase.network.GetBlogUseCase
import com.tematihonov.rst_test.domain.usecase.network.GetMainUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Singleton
    @Provides
    fun provideNetworkRepositoryImpl(repository: NetworkRepositoryImpl): NetworkRepository {
        return repository
    }


    @Singleton
    @Provides
    fun provideNetworkUseCases(networkRepository: NetworkRepository): NetworkUseCase {
        return NetworkUseCase(
            getMainUseCase = GetMainUseCase(networkRepository),
            getBlogUseCase = GetBlogUseCase(networkRepository)
        )
    }

}