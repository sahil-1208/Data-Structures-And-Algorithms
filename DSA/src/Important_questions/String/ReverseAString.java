package Important_questions.String;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {

        System.out.println("Enter The String : ");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        reverseAString(str);

        // char[] chars = str.toCharArray();

        System.out.println("Reversed String ");

    }


    public static void reverseAString(String str) {

        char[] chars = str.toCharArray();

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }


    }

    public static void reverseString(char[] s) {
        int i = 0;
        int n = s.length;
        int j = n - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

}
