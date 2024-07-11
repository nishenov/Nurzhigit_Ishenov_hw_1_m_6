package com.example.nurzhigit_ishenov_hw_1_m_6

class CounterModel {
    private var count = 0

    fun increment(){
        count++
    }
    fun decrement(){
        count--
    }
    fun getResult() = count
}