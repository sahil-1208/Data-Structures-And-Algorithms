package Important_questions.String;

public class Palindrome {

    public static void main(String[] args) {

        String s = "MOM";
        boolean palindromeCheck = isPalindrome(s);
        System.out.println(palindromeCheck);

    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) return true;
            i++;
            j--;
        }
        return false;
    }
}
