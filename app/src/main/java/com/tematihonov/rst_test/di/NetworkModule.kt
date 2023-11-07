package com.tematihonov.rst_test.di

import com.tematihonov.rst_test.data.network.ApiService
import com.tematihonov.rst_test.data.repositoryImpl.NetworkRepositoryImpl
import com.tematihonov.rst_test.utils.RetrofitConstants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideNetworkRepositoryImpl(
        apiService: ApiService
    ) = NetworkRepositoryImpl(apiService)

    @Singleton
    @Provides
    fun provideRetrofit(): ApiService {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiService::class.java)
    }
}