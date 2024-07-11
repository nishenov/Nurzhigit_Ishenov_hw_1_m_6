package com.example.nurzhigit_ishenov_hw_1_m_6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val model = CounterModel()
    private val _counterData = MutableLiveData<Int>()
    val counterData: LiveData<Int> get() = _counterData

    fun onInc() {
        model.increment()
        _counterData.value = model.getResult()
    }

    fun onDec() {
        model.decrement()
        _counterData.value = model.getResult()
    }

}