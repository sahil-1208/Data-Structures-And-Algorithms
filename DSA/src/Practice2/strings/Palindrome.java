package Practice2.strings;

public class Palindrome {

    public static void main(String[] args) {

        String s = "NITIN";
        String s1 = "SAHIL";
        String s3 = " ";

        boolean palindrome = palindrome(s3);
        System.out.println(palindrome);
    }

    public static boolean palindrome(String s) {
        String string = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (string.charAt(start) == string.charAt(end)) return true;
            start++;
            end--;
        }
        return false;

    }

}
