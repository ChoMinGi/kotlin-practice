import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val open = '('
    val close = ')'

    val N = br.readLine().toInt()
    repeat(N) {
        val str = br.readLine()
        val isValid = isValidParentheses(str, open, close)
        println(if (isValid) "YES" else "NO")
    }
}

fun isValidParentheses(str: String, open: Char, close: Char): Boolean {
    var balance = 0
    for (c in str) {
        when (c) {
            open -> balance++
            close -> {
                if (balance == 0) return false
                balance--
            }
        }
    }
    return balance == 0
}
