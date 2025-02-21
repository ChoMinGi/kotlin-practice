import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.ceil

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val N = br.readLine().toInt()

    val numbers = br.readLine().split(" ").map { it.toInt() }

    val isPrime = Array(1001) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..ceil(Math.sqrt(1000.0)).toInt()) {
        if (isPrime[i]) {
            for (j in i * i..1000 step i) {
                isPrime[j] = false
            }
        }
    }

    var count = 0
    for (number in numbers) {
        if (isPrime[number]) {
            count++
        }
    }

    println(count);
}
