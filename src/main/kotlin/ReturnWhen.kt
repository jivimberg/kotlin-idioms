import java.util.*

fun getDefaultLocale2(deliveryArea: String) =
        when (deliveryArea.toLowerCase()) {
            "germany", "austria" -> Locale.GERMAN
            "usa", "great britain" -> Locale.ENGLISH
            "france" -> Locale.FRENCH
            else -> Locale.ENGLISH
        }