import kotlin.math.abs
import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow

fun getDigit(num: Int, i: Int): Int {
    return (floor(abs(num.toDouble()) / 10.0.pow(i.toDouble())) % 10).toInt()
}

fun numberCount(num: Int): Int {
    if (num == 0) return 1
    return (floor(log10(abs(num.toDouble()))) + 1).toInt()
}

fun mostNumbers(nums: List<Int>): Int {
    var maxNumbers = 0
    for (num in nums) {
        maxNumbers = maxOf(maxNumbers, numberCount(num))
    }
    return maxNumbers
}

fun radixSort(nums: MutableList<Int>): List<Int> {
    var numbers = nums.toList()
    val maxNumberCount = mostNumbers(numbers)

    for (a in 0 until maxNumberCount) {
        val numberBuckets = List(10) { mutableListOf<Int>() }
        for (i in numbers.indices) {
            val num = getDigit(numbers[i], a)
            numberBuckets[num].add(numbers[i])
        }
        numbers = numberBuckets.flatten()
    }
    return numbers
}

fun main() {
    val arr = listOf(303, 2923, 176, 412, 609, 588, 767, 9, 823, 10, 672, 686, 90, 16, 53840, 234, 565)
    val sortedArr = radixSort(arr.toMutableList())
    println(sortedArr)
}
