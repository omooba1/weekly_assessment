fun main() {

    var nums: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    evenNumber(nums)

}

fun evenNumber(nums: Array<Int>) {
    for(num in nums) {
        if(num < 4)
            println(num)
    }
    for (num1 in nums){
        if(num1 > 5)
            println(num1)
    }

}