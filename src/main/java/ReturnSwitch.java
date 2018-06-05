import java.util.Locale;

public class ReturnSwitch {

    public Locale getDefaultLocale(String deliveryArea) {
        switch (deliveryArea.toLowerCase()) {
            case "germany":
            case "austria":
                return Locale.GERMAN;
            case "usa":
            case "great britain":
                return Locale.ENGLISH;
            case "france":
                return Locale.FRENCH;
            default:
                return Locale.ENGLISH;

        }
    }
}
