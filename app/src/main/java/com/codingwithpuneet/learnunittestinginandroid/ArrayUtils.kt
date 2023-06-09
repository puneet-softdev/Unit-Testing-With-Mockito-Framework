package com.codingwithpuneet.learnunittestinginandroid

class ArrayUtils {
    fun findLargestNumber(numbers: IntArray): Int {
        var max = Integer.MIN_VALUE
        for (number in numbers) {
            if (number > max) {
                max = number
            }
        }
        return max
    }
}