package Important_questions.arrays;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
//        int secondLargest = secondLargest(arr);
//
//        if (secondLargest == Integer.MIN_VALUE) {
//            System.out.println("There is no second largest element.");
//        } else {
//            System.out.println("The second largest element is: " + secondLargest);
//        }
            print2ndLargest(arr);

    }

    public static int secondLargest(int[] arr) {

        int firstLargest, secondLargest;

        firstLargest = secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (firstLargest < arr[i]) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];

            }

        }
        return secondLargest;
    }

    public static void print2ndLargest(int[] arr) {
        int size = arr.length;
        if (size < 2) System.out.println("Invalid Input");

        Arrays.sort(arr);
        System.out.println("Second Largest Element : " + arr[size - 2]);
    }
}
