package Important_questions.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2, 4, 5};
        int[] removedDuplicates = removeDuplicates(arr);

        for (int nums : removedDuplicates) {
            System.out.print(nums + " ");
        }

    }

    // Time Complexity : O(n)
    public static int[] removeDuplicates(int[] arr) {

        if (arr.length == 0) return arr;

        Arrays.sort(arr);

        int left = 0;
        int right = 0;
        while (right < arr.length) {
            if (arr[left] != arr[right]) {
                left++;
                arr[left] = arr[right];
            }
            right++;
        }
        return Arrays.copyOfRange(arr, 0, left + 1);
    }

}
