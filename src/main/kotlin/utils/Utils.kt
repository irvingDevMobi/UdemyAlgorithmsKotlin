package dev.irving.utils

fun swap(intArray: IntArray, i: Int, j: Int) {
    if (i == j) return
    val temp = intArray[j]
    intArray[j] = intArray[i]
    intArray[i] = temp
}
