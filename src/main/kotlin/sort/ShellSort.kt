package dev.irving.sort

object ShellSort {
    operator fun invoke(intArray: IntArray) {
        var gap = intArray.size / 2
        while (gap > 0) {
            for (indexFromGap in gap until intArray.size) {
                val newElement = intArray[indexFromGap]
                var index = indexFromGap

                while (index >= gap && intArray[index - gap] > newElement) {
                    intArray[index] = intArray[index - gap]
                    index -= gap
                }
                intArray[index] = newElement
            }

            gap /= 2
        }
    }
}
