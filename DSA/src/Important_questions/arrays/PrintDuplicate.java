package Important_questions.arrays;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 3, 5, 1, 2, 2, 4, 6, 7};
//        int duplicate = printDuplicate(arr);
//        System.out.println("Duplicate Element is : " + duplicate);

        printDuplicateElements(arr);

    }

//    public static int printDuplicate(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    return arr[j];
//                }
//            }
//        }
//
//        return 0;
//    }

    public static void printDuplicateElements(int[] arr) {

        Set<Integer> uniqueValue = new HashSet<>();
        boolean isDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            if (uniqueValue.contains(arr[i])) {
                isDuplicate = true;
                System.out.println("Duplicate Element : " + arr[i]);
            } else {
                uniqueValue.add(arr[i]);
            }
        }
        if (!isDuplicate) {
            System.out.println(uniqueValue);
            System.out.println("No Duplicate Exist !");
        }

    }
}
