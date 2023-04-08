package com.codingwithpuneet.learnunittestinginandroid

class CalculatorWithDependency(private val myDependency: MyDependency) {
    fun add(a: Int, b: Int): Int {
        return myDependency.add(a, b)
    }

    fun multiply(a: Int, b: Int): Int {
        return myDependency.multiply(a, b)
    }
}