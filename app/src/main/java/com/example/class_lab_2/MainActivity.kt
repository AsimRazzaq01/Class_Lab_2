package com.example.class_lab_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.class_lab_2.ui.theme.Class_Lab_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Start

        println("Hello Lambda")

        fun message(x: String){
            println(x)
        }

        var Hi = "Hello Android user !"

//        message(Hi)

//        val afm : (String) -> Unit = {m:String ->
//            println("Message: ")
//            println(m)
//        }

        val calcSalary: (Double, Double) -> Double = {
            sal:Double, raise:Double ->
            sal + (sal*raise)
        }

        val newSal = calcSalary(100.0, .1)
        println("First Salary Raise = $newSal")

        fun useOtherFunction(z: (String) -> Unit){
            z("Android Sucks")
        }

        useOtherFunction(::message)

        fun useFunctionRefParm(y: (Double, Double) -> Double){
            val raise = .2
            val salary = 100.0
            val NewSalary = y(salary, raise)
            println("NEW SALARY: " + NewSalary)
        }

        useFunctionRefParm(calcSalary)


//        SalaryList().show()

//        SalaryList().showWithRaise(calcSalary)

        SalaryList(calcSalary).showWithRaise()



        




    }
}

