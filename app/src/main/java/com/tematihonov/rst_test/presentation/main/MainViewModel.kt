package com.tematihonov.rst_test.presentation.main

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tematihonov.rst_test.domain.usecase.NetworkUseCase
import com.tematihonov.rst_test.utils.ApiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val networkUseCase: NetworkUseCase
): ViewModel() {

    val response: MutableState<ApiState> = mutableStateOf(ApiState.Empty)
    //var list by mutableStateOf<ResponseMain>(ResponseMain(Data(emptyList(), emptyList()),"1", false,"1"))

    init {
        getMain()
    }

//    fun getMain() {
//        viewModelScope.launch {
//            val result = networkUseCase.getMainUseCase.invoke()
//            if (result.isSuccessful) {
//                list = result.body()!!
//            }
//        }
//    }

    fun getMain() {
        viewModelScope.launch {
            networkUseCase.getMainUseCase.invoke().onStart {
                response.value = ApiState.Loading
            }.catch {
                response.value = ApiState.Fail(it)
            }.collect {
                response.value = ApiState.Success(it)
            }
        }
    }

}