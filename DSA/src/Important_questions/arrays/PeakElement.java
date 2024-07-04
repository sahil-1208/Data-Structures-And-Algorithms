package Important_questions.arrays;

import java.util.Arrays;

public class PeakElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 15, 2, 23, 90, 67};
        int peakElement = peakElement(arr);
        System.out.println("Peak Element : " + peakElement);

    }


    public static int peakElement(int[] arr) {

        if (arr.length == 1) return 0;

        if (arr[0] >= arr[1]) return arr[0];

        if (arr.length - 1 > arr.length - 2) return arr[arr.length - 1];

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return arr[i];
            }
        }
        return 0;
    }
}
