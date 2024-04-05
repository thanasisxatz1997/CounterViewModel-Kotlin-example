package com.example.countermvvm

//THIS IS THE MODEL IN OUR MVVM (The data)
//This will take care of the logic

data class CounterModel(var count:Int)

class CounterRepository{
    private var _counter=CounterModel(0)

    //Getter functions
    fun getCounter()=_counter

    fun incrementCounter(){
        _counter.count++
    }

    fun decrementCounter(){
        _counter.count--
    }
}