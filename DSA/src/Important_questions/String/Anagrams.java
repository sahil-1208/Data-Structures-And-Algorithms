package Important_questions.String;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        
        String s = "Listen";
        String s1 = "silent";

        boolean checkedAnagrams = checkAnagrams(s, s1);
        System.out.println(checkedAnagrams);

    }

    public static boolean checkAnagrams(String str1, String str2) {

        if (str1.length() != str2.length()) return false;

        char[] str1CharArray = str1.toLowerCase().toCharArray();
        char[] str2CharArray = str2.toLowerCase().toCharArray();


        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);

        return Arrays.equals(str1CharArray, str2CharArray);

    }
}
