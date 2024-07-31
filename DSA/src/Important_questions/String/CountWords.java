package Important_questions.String;

public class CountWords {

    public static void main(String[] args) {

        String s = "I am Good";
        //countWords(s);
        int noOfWords = countNoOfWords(s);
        System.out.println("No of Words in String : " + noOfWords);

    }

    public static void countWords(String str) {

        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }

        System.out.println("No of Elements in String are : " + count);
    }

    public static int countNoOfWords(String str) {

        String nstr = str.trim();

        String[] words = nstr.split(" ");

        return words.length;
    }
}
