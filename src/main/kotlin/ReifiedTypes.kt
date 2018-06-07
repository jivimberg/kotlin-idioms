import com.fasterxml.jackson.databind.ObjectMapper
import model.Address
import java.io.IOException

private inline fun <reified T> fromJson(json: String): T? {
    return try {
        ObjectMapper().readValue(json, T::class.java)
    } catch (e: IOException) {
        null
    }
}

fun main(args: Array<String>) {
    val json = """{ "city" : "San Francisco" }"""
    val address: Address? = fromJson(json)
    println(address)
}