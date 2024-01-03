package dev.irving.sort

object InsertionSort {
    operator fun invoke(intArray: IntArray) {
        for (firstUnsortedIndex in 1 until intArray.size) {
            val newElement = intArray[firstUnsortedIndex]
            var index = firstUnsortedIndex
            while (index > 0 && intArray[index - 1] > newElement) {
                intArray[index] = intArray[index - 1]
                index--
            }
            intArray[index] = newElement
        }
    }
}
