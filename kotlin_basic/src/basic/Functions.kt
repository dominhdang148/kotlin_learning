package basic

import java.time.LocalDateTime
import kotlin.math.pow

// 1. Write a Kotlin program to print "Hello" on screen and your name on a separate line
fun exercise1() {
    println("Hello,\nDoMinhDang")
}

// 2. Write a Kotlin program to find out what version of Kotlin you are using
fun exercise2() {
    println(KotlinVersion.CURRENT)
}

// 3. Write a Kotlin program to display the current date and time
fun exercise3() {
    println(LocalDateTime.now())
}

// 4. Write a Kotlin program to take user input and display it
fun exercise4() {
    print("Say something: ")
    val value = readln()
    println("You just type: $value")
}

// 5. Write ad Kotlin program to perform addition, subtraction, multiplication and division of numbers.
fun exercise5(x: Int, y: Int) {
    println("$x + $y = ${x + y}")
    println("$x - $y = ${x - y}")
    println("$x * $y = ${x * y}")
    println(if (y != 0) "$x / $y = ${x / y}" else "Cannot divide by zero")
}

// 6. Write a Kotlin program to check if a given number is even or odd (lambda function)
val exercise6: (Int) -> Boolean = { (it and 1) == 0 }

// Similar with:
fun exercise6(number: Int): Boolean {
    return (number and 1) == 0
}

// 7. Write a Kotlin program to find the maximum and minimum of three number
fun exercise7(a: Int, b: Int, c: Int) {
    val max = maxOf(a, b, c)
    val min = minOf(a, b, c)
    println("Max: $max")
    println("Min: $min")
}

// 8. Write a Kotlin program to find the factorial of a given number
fun exercise8(number: Int): Int {
    if (number == 0 || number == 1)
        return 1
    return number * exercise8(number - 1)
}

// 9. Write a Kotlin program to check if a given year is a leap year
val exercise9: (Int) -> Boolean = { year -> (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) }

// 10. Write a Kotlin program to calculate the area and perimeter of a circle.
fun exercise10(radius: Double) {
    println("Perimeter: ${2 * Math.PI * radius}")
    println("Area: ${Math.PI * radius.pow(2.0)}")
}

// 11. Write a program to convert temperature from Celsius to Fahrenheit and vice versa
fun exercise11(temperature: Float) {
    println("============ TEMPERATURE CONVERTER ============")
    print
    println("===============================================")
}