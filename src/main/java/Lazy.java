public class Lazy {
    private String lazyValue;

    private String getLazyValue() {
        if (lazyValue == null) {
            System.out.println("computed!");
            lazyValue = "Hello";
        }

        return lazyValue;
    }

    public static void main(String[] args) {
        Lazy lazyClass = new Lazy();
        System.out.println(lazyClass.getLazyValue());
        System.out.println(lazyClass.getLazyValue());
    }
}
    