import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class JavaCustomer {
    @NotNull
    private final String name;
    @NotNull
    private final String email;

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    public JavaCustomer(@NotNull String name, @NotNull String email) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(email, "email");
        this.name = name;
        this.email = email;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.email;
    }

    @NotNull
    public final JavaCustomer copy(@NotNull String name, @NotNull String email) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(email, "email");
        return new JavaCustomer(name, email);
    }

    @NotNull
    public static JavaCustomer copy$default(JavaCustomer var0, String var1, String var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.name;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.email;
        }

        return var0.copy(var1, var2);
    }

    public String toString() {
        return "JavaCustomer(name=" + this.name + ", email=" + this.email + ")";
    }

    public int hashCode() {
        return (this.name != null ? this.name.hashCode() : 0) * 31 + (this.email != null ? this.email.hashCode() : 0);
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 instanceof JavaCustomer) {
                JavaCustomer var2 = (JavaCustomer)var1;
                if (Intrinsics.areEqual(this.name, var2.name) && Intrinsics.areEqual(this.email, var2.email)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
