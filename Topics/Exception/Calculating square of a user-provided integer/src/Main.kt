import java.util.*

fun main(args: Array<String>) {
    // Create a Scanner object for taking input.
    val reader = Scanner(System.`in`)

    // Get the user input.
    val number = reader.next()

    // Convert the input to an Integer and calculate its square inside a try-catch block.
    try {
        val square = number.toInt() * number.toInt()
        println(square)

    } 
    catch(e: Exception) {

        println("Invalid number.")

    }
}