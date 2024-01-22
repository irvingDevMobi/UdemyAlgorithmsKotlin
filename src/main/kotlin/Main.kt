package dev.irving

import dev.irving.sort.*

//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    //val array = intArrayOf(4, 6, 54, -45, 9, 18)
    val array = intArrayOf(20, 35, -15, 7, 55, 1, -22)
    array.println()
    //BubbleSort(array)
    //SelectionSort(array)
    //InsertionSort(array)
    /*
    ShellSort(array)
    println()
    array.forEach { print("$it ") }
    println(Factorial.iterative(4))
    println(Factorial.recursive(4))
     */
    MergeSort(array)
    array.println()
}

fun IntArray.println(message: String? = null) {
    message?.let { kotlin.io.println(it) }
    print("[")
    this.forEach { print("$it ") }
    kotlin.io.println("]")
}

fun IntArray.asString(start: Int = 0, end: Int = this.size): String {
    val array = this
    return buildString {
        append("[")
        for (i in start until end) {
            append("${array[i]} ")
        }
        append("]")
    }
}
