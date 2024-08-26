/*
Problem Requirements

Write a Name Formatter function
    - Write a higher-order function named printFormattedName
    - Function will take 2 parameters: firstName,lastName
    - Function will take in a functional parameter to format the names
    - Functional parameter should take 2 Strings and return String
    - printFormattedName should print the result of calling the format function
 */

/*Notes: concepts to remember function parameters. One can input function as an input
        Example fun primaryName(p1,1p2, functionalPara (Type, Type) -> returnTye { function of primaryFunc}
*/

fun printFormattedName(firstName:String, lastName:String, format: (String, String) -> String) {
    println(format (firstName, lastName))
}

/* to input the val into the functional parameter,
    Format the val to match the functional para input and output
    then use lamda to create format
 */
val basicFormat: (String, String) -> String = {firstName, lastName -> "$firstName $lastName"}
val introduceMyselfFormat: (String, String) -> String = {firstName, lastName -> "Hello my name is $firstName $lastName";


}

fun main() {
    printFormattedName("Andy", "Durrer", basicFormat)
    printFormattedName("Andy", "Durrer", introduceMyselfFormat)
    //inject a ladma function parameter instead of using a val.
    printFormattedName("Testing", "Lamda") { firstName, lastName ->
        "I am $firstName $lastName to replace the function parameter"
    }

}


