package dev.irving.sort

import dev.irving.utils.swap

object SelectionSort {

    operator fun invoke(intArray: IntArray) {
        for (lastUnsortedIndex in intArray.size -1 downTo 0) {
            var indexOfLargest = 0
            for (i in 1..lastUnsortedIndex) {
                if (intArray[i] > intArray[indexOfLargest]) {
                    indexOfLargest = i
                }
            }
            swap(intArray, indexOfLargest, lastUnsortedIndex)
        }
    }
}
