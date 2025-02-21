import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.ceil

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    // 참가자 수 입력
    val N = br.readLine().toLong()

    // 티셔츠 사이즈별 신청 수 입력
    val shirtSizes = br.readLine().split(" ").map { it.toLong() }

    // 티셔츠 및 펜 묶음 단위 입력
    val (T, P) = br.readLine().split(" ").map { it.toLong() }

    // 티셔츠 최소 묶음 수 계산 (각 사이즈별 필요한 묶음 개수를 합산)
    val minShirtBundles = shirtSizes.sumOf { ceil(it.toDouble() / T).toLong() }

    // 펜 최대 묶음 수 및 개별 주문 개수 계산
    val maxPenBundles = N / P
    val remainingPens = N % P

    // 결과 출력
    println(minShirtBundles)
    println("$maxPenBundles $remainingPens")
}
