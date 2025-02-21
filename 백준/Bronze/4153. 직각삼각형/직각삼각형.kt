fun main() {
    val br = System.`in`.bufferedReader()
    while (true) {
        val (a, b, c) = br.readLine().split(" ").map { it.toInt() }
        if (a == 0 && b == 0 && c == 0) break
        checkRightTriangle(a, b, c)
    }
}

// 직각 삼각형
fun checkRightTriangle(a: Int, b: Int, c: Int) {
    val max = maxOf(a, b, c)
    val sum = a + b + c
    if (sum - max <= max) {
        println("Invalid")
    } else {
        when {
            a * a + b * b == c * c -> println("right")
            a * a + c * c == b * b -> println("right")
            b * b + c * c == a * a -> println("right")
            else -> println("wrong")
        }
    }
}