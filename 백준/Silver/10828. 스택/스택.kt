import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val stack = Stack<Int>()
    val sb = StringBuilder()

    repeat(n) {
        val input = br.readLine().split(" ")
        val (cmd, value) = if (input.size == 2) input else listOf(input[0], "-1")

        when (cmd) {
            "push" -> stack.push(value.toInt())
            "pop" -> sb.appendLine(if (stack.isEmpty()) -1 else stack.pop())
            "size" -> sb.appendLine(stack.size)
            "empty" -> sb.appendLine(if (stack.isEmpty()) 1 else 0)
            "top" -> sb.appendLine(if (stack.isEmpty()) -1 else stack.peek())
        }
    }

    println(sb)
}
