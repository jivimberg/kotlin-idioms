public class LazyThreadSafe {
    private volatile String lazyValue;

    private String getLazyValue() {
        if (lazyValue == null) {
            synchronized (Lazy.class) {
                if(lazyValue == null) {
                    System.out.println("computed!");
                    lazyValue = "Hello";
                }
            }
        }

        return lazyValue;
    }

    public static void main(String[] args) {
        LazyThreadSafe lazyClass = new LazyThreadSafe();
        System.out.println(lazyClass.getLazyValue());
        System.out.println(lazyClass.getLazyValue());
    }
}
