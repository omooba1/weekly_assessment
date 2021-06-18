fun main(){

    //program that print's the reverse of a string that is supplied.

    println("Entered String: Good Food")
    var str = "Good Food"

    var result: String = ""
    var lastIndex = str!!.lastIndex

    while(lastIndex >= 0){
        result += str[lastIndex]
        lastIndex--
    }

    println("Reversed: $result")

}