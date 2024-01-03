package dev.irving

import dev.irving.sort.BubbleSort
import dev.irving.sort.InsertionSort
import dev.irving.sort.SelectionSort

//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    val array = intArrayOf(4, 6, 54, -45, 9, 18)
    array.forEach { print("$it ") }
    //BubbleSort(array)
    //SelectionSort(array)
    InsertionSort(array)
    println()
    array.forEach { print("$it ") }
}
