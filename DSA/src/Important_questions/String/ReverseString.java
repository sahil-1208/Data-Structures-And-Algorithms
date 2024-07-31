package Important_questions.String;

public class ReverseString {

    public static void main(String[] args) {

        String s = "Fun";
        String reversedString = reverseString(s);
        System.out.println(reversedString);
    }

    public static String reverseString(String str) {
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        return new String(ch);
    }
}
