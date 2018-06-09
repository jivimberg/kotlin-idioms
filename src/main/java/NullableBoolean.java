import org.jetbrains.annotations.Nullable;

public class NullableBoolean {
    public void printBooleanValue(@Nullable Boolean bool) {
        if(bool != null && bool) {
            System.out.println("Boolean is true");
        } else {
            System.out.println("Boolean is false or null");
        }
    }
}
