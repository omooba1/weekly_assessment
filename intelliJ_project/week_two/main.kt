fun main() {
    var num1: Int = 5
    var num2: Int = 10
    var numbs: Array<Int> = arrayOf(3,5,7,9)


    // 10 if statements
    if(num1 == num2){
        println(num1.toString() + " is not equal to " + num2.toString())
    }else {
        println(num2.toString() + " is not equal to " + num1.toString())
    }

    if(num1 > num2){
        println(num1.toString() + " is not greater than " + num2.toString())
    }else {
        println(num2.toString() + " is greater than " + num1.toString())
    }

    if(num1 < num2){
        println(num1.toString() + " is less than " + num2.toString())
    }else {
        println(num2.toString() + " is greater than " + num1.toString())
    }

    if(num1 != num2){
        println(num1.toString() + " is not equal to " + num2.toString())
    }else {
        println(num2.toString() + " is not equal to " + num1.toString())
    }

    if(num1 >= num2){
        println(num1.toString() + " is not greater than and not equal to " + num2.toString())
    }else {
        println(num2.toString() + " is greater than but not equal to " + num1.toString())
    }

    if(num1 <= num2){
        println(num1.toString() + " is not greater than and not equal to " + num2.toString())
    }else {
        println(num2.toString() + " is greater than but not equal to " + num1.toString())
    }

    if(num1 in 1 .. 10){
        println(num1.toString() + " is among the numbers ")
    }else {
        println(num1.toString() + " is not among the numbers ")
    }

    if(num2 in 1 .. 10){
        println(num2.toString() + " is among the numbers ")
    }else {
        println(num2.toString() + " is not among the numbers ")
    }

    if(num1 in 1 .. 10){
        println(num1.toString() + " is among the numbers ")
    }else {
        println(num1.toString() + " is not among the numbers ")
    }

    if(num1 in numbs){
        println(num1.toString() + " is an odd number ")
    }else {
        println(num1.toString() + " is not an odd number ")
    }

    if(num2 in numbs){
        println(num2.toString() + " is not an even number ")
    }else {
        println(num2.toString() + " is an even number ")
    }

    //5 conditional expressions
    var days: String = "Monday"
    var result: String = when (days) {
        "Monday" -> "Monday is school"
        else -> "Not a day of school"
    }
    println(result)


    var daysOfExam: String = "Tuesday"
    var result1: String = when (daysOfExam) {
        "Tuesday" -> "Tuesday is Exam"
        else -> "Not a day of Exam"
    }
    println(result1)

    var fooTimeTable: String = "Friday"
    var result2: String = when (fooTimeTable) {
        "Wednesday" -> "Prepare Rice"
        else -> "Not a day to prepare Rice"
    }
    println(result2)

    var weekEnd: String = "Saturday"
    var result3: String = when (weekEnd) {
        "Saturday" -> "Saturday is weekend"
        else -> "Not weekend"
    }
    println(result3)

    var lastMonthOfTheYear: String = "December"
    var result4: String = when (lastMonthOfTheYear) {
        "December" -> "Last month of the year"
        else -> "Not the last month of the year"
    }
    println(result4)


}