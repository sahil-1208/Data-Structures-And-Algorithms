package Important_questions.String;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {

        System.out.println("Enter The String : ");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();;

        char[] chars = str.toCharArray();

        reverseString(chars);
        System.out.println(chars);

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
