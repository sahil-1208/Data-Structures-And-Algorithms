package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {4, 2, 6, 5, 1, 3};

        insertionSort(numbers);

        System.out.println(Arrays.toString(numbers));


    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
}
/*insertion sort works:
Start with the second element (index 1) of the array.
Compare the second element with the first element. If the second element is smaller, swap them.
Move to the third element (index 2). Compare it with the elements to its left and insert it into its correct position in the sorted sublist.
Repeat this process for all remaining elements in the array, incrementally growing the sorted sublist.
Continue until all elements are sorted
* */
