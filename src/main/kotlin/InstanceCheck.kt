fun isInfinite(number: Number) = when(number) {
    is Int -> println("Not infinite")
    is Double -> println("Infinite? ${number.isInfinite()}")
    else -> throw IllegalArgumentException()
}

fun main(args: Array<String>) {
    isInfinite(1)
    isInfinite(2.0 / 0.0)
}