package Important_questions.String;

public class ReverseWordsOfString {

    public static void main(String[] args) {

        String s = "Today is Wednesday";
        String reverseWords = reverseWords(s);
        String reverseStringWords = reverseStringWords(s);
        System.out.println("Original String : " + s);
        System.out.println("Reversed String : " + reverseWords);
        System.out.println("Reversed String : " + reverseStringWords);

    }

    public static String reverseWords(String str) {

        String[] strArrays = str.split(" ");

        StringBuilder reversedString = new StringBuilder();

        for (int i = strArrays.length - 1; i >= 0; i--) {
            reversedString.append(strArrays[i]).append(" ");
        }

        return reversedString.toString();
    }

    public static String reverseStringWords(String str) {

        String[] words = str.split(" ");
        String reversedString = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i];

            if (i != 0) reversedString += " ";
        }

        return reversedString;
    }
}
