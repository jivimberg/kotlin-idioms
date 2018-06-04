public class StringUtil {
    private static long countWhitespaces(String s) {
        return s.chars()
                .filter(ch -> ch == ' ')
                .count();
    }

    public static void main(String[] args) {
        System.out.println(StringUtil.countWhitespaces("There are 6 whitespaces in this sentence"));
    }
}
