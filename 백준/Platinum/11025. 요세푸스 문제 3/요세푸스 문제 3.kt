import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (N, K) = br.readLine().split(" ").map { it.toInt()}

    var res = 0
    for (i in 2 .. N){
        res = (res +K) % i
    }
    println(res+1)
}
