package com.tematihonov.rst_test.presentation.main

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tematihonov.rst_test.domain.models.responseBlog.Data
import com.tematihonov.rst_test.domain.usecase.NetworkUseCase
import com.tematihonov.rst_test.utils.ApiState
import com.tematihonov.rst_test.utils.ApiStateBlog
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val networkUseCase: NetworkUseCase
): ViewModel() {

    val response: MutableState<ApiState> = mutableStateOf(ApiState.Loading)
    val responseBlog: MutableState<ApiStateBlog> = mutableStateOf(ApiStateBlog.Loading)
    var selectedBlog by mutableStateOf<Data?>(null)

    init {
        getMain()
    }

    fun selectBlog(blog: Data) {
        selectedBlog = blog
    }

    fun getBlog(url: String) {
        viewModelScope.launch {
            networkUseCase.getBlogUseCase.invoke(url).onStart {
                responseBlog.value = ApiStateBlog.Loading
            }.catch {
                responseBlog.value = ApiStateBlog.Fail(it)
            }.collect {
                responseBlog.value = ApiStateBlog.Success(it)
            }
        }
    }

    fun getMain() {
        viewModelScope.launch {
            networkUseCase.getMainUseCase.invoke().onStart {
                response.value = ApiState.Loading
            }.catch {
                response.value = ApiState.Fail(it)
            }.collect {
                response.value = ApiState.Success(it)

                if (it.data.content.last().title == "Блог") {
                    getBlog(it.data.content.last().url)
                }
            }
        }
    }

}