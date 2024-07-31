package Important_questions.String;

import java.util.HashMap;

public class CharOccurrence {

    public static void main(String[] args) {

        String s = "I am Good";
        countOccurrence(s);

    }

    public static void countOccurrence(String str) {

        HashMap<String, Integer> charMap = new HashMap<>();

        for (String s : str.split(" ")) {
            if (charMap.containsKey(s)) {
                charMap.put(s, charMap.get(s) + 1);
            } else {
                charMap.put(s, 1);
            }
        }

        System.out.println(charMap);
    }
}
