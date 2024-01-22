package dev.irving.utils

object Factorial {

    fun iterative(num: Int): Int {
        if (num == 0) return 1

        var factorial = 1
        for (i in 1..num) {
            factorial *= i
        }
        return factorial
    }

    fun recursive(num: Int): Int {
        if (num == 0) return 1
        return num * recursive(num - 1)
    }
}
