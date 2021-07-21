fun main() {


    val num = 348597
    println("Original Number : $num")
    println("Reversed Number : " + reverseNumber(num))

    val num1 = 258
    println("Original Number : $num1")
    println("Reversed Number : " + reverseNumber(num1))
}

fun reverseNumber(number: Int): Int {
    var number = number
    var reverse = 0
    while (number != 0) {
        reverse = reverse * 10 + number % 10
        number /= 10
    }
    return reverse
}