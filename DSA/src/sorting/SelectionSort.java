package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = {4, 2, 6, 5, 1, 3};

        selectionSort(numbers);

        System.out.println(Arrays.toString(numbers));

    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
/*selection sort algorithm:
Start with the first element as the current minimum.
Compare this element with the rest of the elements in the list to find the minimum element.
Swap the current minimum element with the first element of the list.
Move the starting point of the sublist one element to the right.
Repeat steps 2-4 until the sublist becomes empty.

time complexity = O(n^2)
* */