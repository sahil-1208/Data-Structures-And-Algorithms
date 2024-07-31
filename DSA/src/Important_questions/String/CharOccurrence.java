package Important_questions.String;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {

    public static void main(String[] args) {

        String s = "I am Good";
        countOccurrence(s);

    }

    public static void countOccurrence(String str) {

        HashMap<Character, Integer> charMap = new HashMap<>();

        char[] chars = str.toCharArray();

        for (char ch : chars) {

            if (ch == ' ') continue;
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        System.out.println(" The Occurrence of each Character in this String is : ");
        for (Map.Entry<Character, Integer> charOccurrence : charMap.entrySet()) {
            System.out.println(charOccurrence.getKey() + " : " + charOccurrence.getValue());
        }


    }
}
