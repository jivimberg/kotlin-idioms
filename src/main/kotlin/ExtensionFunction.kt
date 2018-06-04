fun String.countWhitespaces(): Int {
    return this.filter { it == ' ' }.count()
}

fun main(args: Array<String>) {
    print("There are 6 whitespaces in this sentence".countWhitespaces())
}