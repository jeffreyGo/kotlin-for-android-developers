package com.antonioleiva.weatherapp

import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by jeffrey on 2016. 7. 27..
 */



class Chapter22Test {


    @Test
    fun ifTest() {
        var x = 1
        var y = if (x != null && x > 2) x else 0

        print("x == " + x  + " y == " + y)
    }


    @Test
    fun whenTest1() {
        var x = 1
//        var x = 2
//        var x = 3
//        var x = "others"

        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            3, 4 -> print("x == 3 or x == 4")
            else -> print("x is neither 1 nor 2")
        }
    }



    open class Vehicle() {}
    class Car: Vehicle() {}
    class Bicycle : Vehicle() {}
    class Motorcycle: Vehicle() {}

    @Test
    fun whenTest2() {
        var wheelObject : Vehicle = Car()

        when (wheelObject) {
            is Car -> print("is Car!!") // Car
            is Bicycle -> print("is Bicycle!!")
            is Motorcycle -> print("is Motorcycle!!")
            else -> print("is not Vehicle!!")
        }
    }

    @Test
    fun whenTest3() {
        var x : Int = 10

        val cost = when(x) {
            in 1..10 -> "cheap"
            in 10..100 -> "regular"
            in 100..1000 -> "expensive"
//            in specialValues -> "special Values!"
            else -> "not rated"
        }
        print("cost = " + cost)
    }

    @Test
    fun whenTest4() {
        var x : Int = 5
        var s : String = "hello!!!"
        var v : Car = Car()

        val res = when {
            x in 1..10 -> "cheap"
            s.contains("hello") -> "it's a welcome!"
            v is Car -> print("great!!")
            else -> ""
        }

        print("res = " + res)
    }

    @Test
    fun ifTest1() {
        val list = "123456"

        for (index in 0..list.count() -1) {
            print("item ${index} = ${list.get(index)}\n")
        }

    }

    @Test
    fun ifTest2() {
        val array = "123456"
        for (i in 0 downTo  10) {

        }

        for (i in array.indices) {
            print(array[i])
        }
    }



}