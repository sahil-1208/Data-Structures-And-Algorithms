package Important_questions.String;

public class ReverseEachWordOfString {

    public static void main(String[] args) {

        String s = "Java is good programming langauge";

        String reverseEachWord = reverseEachWord(s);
        System.out.println(reverseEachWord);


    }

    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder reverseString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            reverseString.append(reverseWord.reverse().toString()).append(" ");
        }

        return reverseString.toString().trim();

    }
}
