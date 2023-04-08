package com.codingwithpuneet.learnunittestinginandroid

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorTestWithMockitoRunner {
    @Mock
    lateinit var myDependency: MyDependency

    lateinit var myCalculator: CalculatorWithDependency

    @Before
    fun setUp() {
        myCalculator = CalculatorWithDependency(myDependency)
    }

    @Test
    fun testAdd() {
        `when`(myDependency.add(2, 3)).thenReturn(5)
        val result = myCalculator.add(2, 3)
        assertEquals(5, result)
    }

    @Test
    fun testMultiply() {
        `when`(myDependency.multiply(2, 3)).thenReturn(6)
        val result = myCalculator.multiply(2, 3)
        assertEquals(6, result)
    }
}