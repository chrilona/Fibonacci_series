package com.lonainnovs.fibonacci_series_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.lonainnovs.fibonacci_series_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList=fibonacci_100(100)
        binding.rvNumbers.layoutManager=LinearLayoutManager(this)
        binding.rvNumbers.adapter=Fibonacci_recycler(numberList)
    }
    fun fibonacci_100(size:Int):List<Int>{
        var listnums=ArrayList<Int>()
        var start=0
        var steps=1
        var sumNum=0
        while (sumNum <= size){
            print(start)
            var sumNums= start+steps
            start=steps
            steps=sumNums
            sumNum++
            listnums+=sumNums
        }
        return listnums
    }


}