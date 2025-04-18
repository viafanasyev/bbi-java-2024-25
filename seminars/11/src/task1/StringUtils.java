package task1;

public class StringUtils {
    private StringUtils() {}

    public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            result += s.charAt(i);
        }
        return result;
    }

    public static String changeCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += c;
            }
        }
        return result;
    }
}
