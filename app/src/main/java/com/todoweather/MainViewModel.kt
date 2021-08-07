package com.todoweather

import androidx.lifecycle.*
import com.todoweather.models.Welcome
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val apiService: ApiService) : ViewModel() {

    private val _data = MutableLiveData<Welcome>()
    val data: LiveData<Welcome> = _data

    init {
        getWeather()
    }

    private fun getWeather() {
        viewModelScope.launch {
            _data.value = apiService.getCurrentWeather("London")
        }
    }
}