fun main() {

    val result: Boolean = inLove(4, 4)
    println(result)
    val result1: Boolean = inLove(3, 11)
    println(result1)
    val result3: Boolean = inLove(22, 17)
    println(result3)
}

fun inLove(flower1: Int, flower2: Int): Boolean {
    if (flower1 % 2 == 0 && flower2 % 2 != 0) {
        return true
    } else return flower1 % 2 != 0 && flower2 % 2 == 0
}


