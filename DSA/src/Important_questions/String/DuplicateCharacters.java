package Important_questions.String;


import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    public static void main(String[] args) {

        String s = "I am Good";
        duplicateCharacters(s);


    }

    public static void duplicateCharacters(String str) {

        HashMap<Character, Integer> duplicateElement = new HashMap<>();

        char[] strCharArray = str.toCharArray();

        for (char ch : strCharArray) {

            if (ch == ' ') continue;

            if (duplicateElement.containsKey(ch)) {
                duplicateElement.put(ch, duplicateElement.get(ch) + 1);
            } else {
                duplicateElement.put(ch, 1);
            }
        }

        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> characterOccurence : duplicateElement.entrySet()) {
            if (characterOccurence.getValue() > 1) {
                System.out.println(characterOccurence.getKey() + " : " + characterOccurence.getValue());
            }
        }
    }
}
