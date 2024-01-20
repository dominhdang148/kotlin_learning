import java.time.LocalDateTime
import java.util.Date
import java.util.Scanner

// 1. Write a Kotlin program to print "Hello" on screen and your name on a separate line
fun exercise1(){
    println("Hello,\nDoMinhDang")
}

// 2. Write a Kotlin program to find out what version of Kotlin you are using
fun exercise2(){
    println(KotlinVersion.CURRENT)
}

// 3. Write a Kotlin program to display the current date and time
fun exercise3(){
    println(LocalDateTime.now())
}

// 4. Write a Kotlin program to take user input and display it
fun exercise4(){

    print("Say something: ")
    val value = readln()
    println("You just type: $value")

}