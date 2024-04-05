package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


//THIS IS THE VIEW MODEL IN OUR MVVM
//This will take care of the communication using a repository

class CounterViewModel() : ViewModel() {
    private val _repository: CounterRepository= CounterRepository()
    private val _count = mutableStateOf(_repository.getCounter().count)

    val count : MutableState<Int> =_count

    fun increment(){
        _repository.incrementCounter()
        _count.value=_repository.getCounter().count
    }
    fun decrement(){
        _repository.decrementCounter()
        _count.value=_repository.getCounter().count
    }
}
