fun main() {
    //loop that printout 1 to 100
    var i: Int = 1
    while (i < 101) {
        println(i)
        i++
    }

    //loop that printout 1 to 10 without printing 4 and 5
    var x: Int = 1
    while (x < 11) {
        println(x)
        i++
    }

    //program which print out only the even numbers between 10 and 20 and the odd numbers between 20 and 30
  var nums: Array<Int> = arrayOf(10,11,12,13,14,15,16,17,18,19,20)
    evenNumber(nums)

    var numbs: Array<Int> = arrayOf(20,21,22,23,24,25,26,27,28,29,30)
    oldNumber(numbs)
}

fun evenNumber(nums: Array<Int>) {
    for(num in nums) {
        if(num % 2 == 0) {
            println(num)
        }
    }

}

fun oldNumber(numbs: Array<Int>) {
    for(num in numbs) {
        if(num % 2 == 1) {
            println(num)
        }
    }


}