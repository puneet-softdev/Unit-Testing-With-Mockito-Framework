# Unit-Testing-With-Mockito-Framework

What is Mockito?

Mockito is a popular open-source testing framework to create and configure mock objects for unit testing purposes
Now what are mock objects? Mock objects are used to replace real objects
That means it can simulate the behavior of real objects during testing
So It simplifies the process of creating and managing mock objects, making your tests easier to write and maintain.
Overall, Mockito brings a lot of benefits to Android development, including easier testing, improved code quality, and faster development cycles

Why is Mockito required?

* Helps to write clean and modular tests.
* Increases code coverage and ensures code quality.
* Facilitates test-driven development.
* Allows testing of individual components in isolation.

-- Setup --

dependencies {
    // ...
    testImplementation 'junit:junit:4.13.1'
    testImplementation 'org.mockito:mockito-core:3.11.2'
    testImplementation 'org.mockito:mockito-inline:3.11.2'
    testImplementation 'org.mockito:mockito-kotlin:2.2.0'
}

* Create a simple Android application with a single activity.
* Implement a basic calculator class with add, subtract, multiply, and divide functions.
* Write a basic UI to interact with the calculator class.


Writing Unit Tests using Mockito and Kotlin


class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        return a / b
    }
}

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

In the above code, we have written two test cases. The first test case, testAdd, uses JUnit's built-in assertEquals method to verify that the output of the add method is equal to 5 when we pass 2 and 3 as input parameters.
The second test case, testAddWithMockito, uses Mockito to mock the Calculator class and test the add method.

Similarly, you can write test cases for the other methods of the Calculator class using JUnit and Mockito.
