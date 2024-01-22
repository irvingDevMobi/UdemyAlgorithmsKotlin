package dev.irving.sort

import dev.irving.asString
import dev.irving.println

object MergeSort {

    operator fun invoke(input: IntArray, start: Int = 0, end: Int = input.size) {
        if (end - start < 2) return

        val middle = (start + end) / 2
        invoke(input, start, middle)
        invoke(input, middle, end)
        merge(input, start, middle, end)
    }

    private fun merge(input: IntArray, start: Int, middle: Int, end: Int) {
        println("Init a merge call of ${input.asString(start, end)}, start = $start, middle = $middle, end = $end")
        if (input[middle - 1] <= input[middle]) {
            input.println("Ending merge call")
            return
        }

        var leftIndex = start
        var rightIndex = middle

        var tempIndex = 0
        val temp = IntArray(end - start)

        println("Temporal Array ${temp.asString()}, leftIndex = $leftIndex, rightIndex = $rightIndex, tempIndex = $tempIndex")
        while (leftIndex < middle && rightIndex < end) {
            temp[tempIndex++] = if (input[leftIndex] <= input[rightIndex]) input[leftIndex++]
            else input[rightIndex++]
            println("Temporal Array ${temp.asString()}, leftIndex = $leftIndex, rightIndex = $rightIndex, tempIndex = $tempIndex")
        }
        val destPosition = start + tempIndex
        val length = middle - leftIndex
        println(
            "Copying from Input array: ${input.asString(leftIndex, leftIndex + length)} to Input" +
                    input.asString(destPosition, destPosition + length)
        )
        System.arraycopy(input, leftIndex, input, destPosition, length)
        input.println()
        println("Copying from Temp array: ${temp.asString(0, tempIndex)} to Input ${input.asString(start, start + tempIndex)}")
        System.arraycopy(temp, 0, input, start, tempIndex)
        input.println("Ending merge call")
    }
}
