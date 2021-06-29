fun main() {

        val result: Boolean = threeInt(2, 4, 6)
        println(result)
        val result1: Boolean = threeInt(4, 6, 2)
        println(result1)
        val result3: Boolean = threeInt(4, 6, 3)
        println(result3)
    }

    fun threeInt(a: Int, b: Int, c: Int): Boolean {
        if (b in (c + 1) until a && b > c) return a - b == b - c
        if (b in (c + 1) until a && b > b) return a - c == c - b
        if (b > a && b > c && a > c) return b - a == a - c
        if (b > a && b > c && c > a) return b - c == c - a
        if (c > a && c > b && a > b) return c - a == a - b
        return c - b == b - a
    }

