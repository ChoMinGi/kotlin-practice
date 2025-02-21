import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val input = br.readLine()
        if (input == "0") break

        var isPalindrome = true
        for (i in 0 ..<input.length/2) {
            if (input[i] != input[input.length-1-i]) {
                isPalindrome = false
                break
            }
        }

        println(if (isPalindrome) "yes" else "no")
    }
}
