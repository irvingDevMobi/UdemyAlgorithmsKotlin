package dev.irving.sort

import dev.irving.utils.swap

object BubbleSort {
    operator fun invoke(intArray: IntArray) {
        for (lastUnsortedIndex in intArray.size - 1 downTo 0) {
            for (i in 0 until lastUnsortedIndex) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1)
                }
            }
        }
    }
}
