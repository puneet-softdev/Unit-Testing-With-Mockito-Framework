package com.codingwithpuneet.learnunittestinginandroid

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.*

import org.junit.Test

class MathUtilsTest {

    @Test
    fun factorial() {

    }

    // Matchers

    @Test
    fun useEqualTo(){
        val expected = "CodingWithPuneet"
        val actual = "CodingWithPuneet"
        assertThat(actual, equalTo(expected))
    }

    @Test
    fun useInstanceOf(){
        val obj: Any = "CodingWithPuneet"
        assertThat(obj, instanceOf(String::class.java))
    }

    @Test
    fun testNot(){
        val expected = "CodingWithPuneet"
        val actual = "CodingWith"
        assertThat(actual, not(equalTo(expected)))
    }

    @Test
    fun testAnyOf(){
        val actual = "CodingWith"
        assertThat(actual, anyOf(
            equalTo("GoodBye"),
            containsString("With")
        ))
    }
}