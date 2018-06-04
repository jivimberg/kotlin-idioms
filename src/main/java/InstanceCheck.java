import org.jetbrains.annotations.NotNull;

public class InstanceCheck {

    private static void isInfinite(@NotNull Number number) {
        if(number instanceof Integer) {
            System.out.println("Not infinite");
        } else if(number instanceof Double) {
            System.out.println("Infinite? " + ((Double) number).isInfinite());
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        isInfinite(1);
        isInfinite(2.0 / 0.0);
    }
}
