package com.codingwithpuneet.learnunittestinginandroid

class MathUtils {
    fun factorial(n: Int): Int {
        if (n == 0 || n == 1) {
            return 1
        }
        return n * factorial(n - 1)
    }
}