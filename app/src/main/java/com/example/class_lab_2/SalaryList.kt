package com.example.class_lab_2

import android.util.Log

class SalaryList(funRef: (Double,Double) -> Double) {

    val salaries: List<Double>

    init{
        salaries = listOf(80.0, 100.0, 90.0, 70.0, 120.0)
    }

    fun show(){
        for (sal in salaries) {
            println("Salary: $sal")
        }
    }


//    fun showWithRaise(funRef: (Double,Double) -> Double){
//        var raisePct = .1
//        for (sal in salaries){
//            val newSalary = funRef(sal, raisePct)
//            println("New Salary: $newSalary")
//        }
//    }


    fun showWithRaise(){
        var raisePct = .1
        for (sal in salaries){
            val newSalary = (sal +(sal * raisePct))
            println("New Salary: $newSalary")
        }
    }


}