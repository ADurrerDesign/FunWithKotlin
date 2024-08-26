/*
Problem Requirements

Write a Name Formatter function
    - Write a higher-order function named printFormattedName
    - Function will take 2 parameters: firstName,lastName
    - Function will take in a functional parameter to format the names
    - Functional parameter should take 2 Strings and return String
    - printFormattedName should print the result of calling the format function
 */

fun printFormattedName(name: String) {
    println(name)
}

fun formatName (firstName: String,lastName: String): String {return firstName + " " + lastName}

fun main() {
    printFormattedName(formatName("John","Doe"))
    printFormattedName(formatName("X", "86"))
    printFormattedName(formatName("Hello", "World"))
}


