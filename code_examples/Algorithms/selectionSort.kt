fun selectionSort(arr: IntArray): IntArray {
    for (i in arr.indices) {
        var min = i
        for (j in i + 1 until arr.size) {
            if (arr[min] > arr[j]) {
                min = j
            }
        }
        if (i != min) {
            val temp = arr[i]
            arr[i] = arr[min]
            arr[min] = temp
        }
    }
    return arr
}

fun main() {
    val arr = intArrayOf(3, 55, 7, 10, 6, 8, 12, 16, 42)
    println(selectionSort(arr).contentToString())
}