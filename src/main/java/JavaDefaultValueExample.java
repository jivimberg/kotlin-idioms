import org.jetbrains.annotations.NotNull;

public class JavaDefaultValueExample {
    void foo() {
        System.out.println("" + 0);
    }

    void foo(String b) {
        System.out.println(b + 0);
    }

    void foo(int a) {
        System.out.println("" + a);
    }

    void foo(int a, @NotNull  String b) {
        System.out.println(b + a);
    }
}
