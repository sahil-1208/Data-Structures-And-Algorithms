package Practice2.strings;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "Hello My Name is Java";

        String reverseString = reverseString(str);

        System.out.println(reverseString);

    }

    public static String reverseString(String str) {

        char[] chars = str.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
