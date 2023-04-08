package com.codingwithpuneet.learnunittestinginandroid

import org.junit.Assert.*

import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`

class CalculatorTest {

    @Test
    fun testAdd() {
        val calculator = Calculator()
        val result = calculator.add(2,3)
        assertEquals(5, result)
    }

    @Test
    fun testAddWithMockito() {
        val calculator = mock(Calculator::class.java)
        `when`(calculator.add(2, 3)).thenReturn(5)
        assertEquals(calculator.add(2, 3), 5)
    }
}