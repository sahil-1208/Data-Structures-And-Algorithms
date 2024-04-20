package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {4, 2, 6, 5, 1, 3};

        bubbleSort(numbers);

        System.out.println(Arrays.toString(numbers));

    }

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

/*
* bubble sort works:

Start at the beginning of the list.
Compare the first two elements. If the first element is greater than the second element, swap them.
Move to the next pair of elements (the second and third elements), and repeat step 2.
Continue this process until the end of the list is reached. At this point, the largest element is at the end of the list.
Repeat steps 1-4 for all elements except the last one.
*After each pass, the next largest element will be in its correct position.
Continue this process until no more swaps are needed, indicating that the list is sorted.
*
* time complexity = O(n^2)
* */
/*Bubble Sort Working
 * 4, 2, 6, 5, 1, 3
 * 2, 4, 6, 5, 1, 3
 * 2, 4, 6, 5, 1, 3
 * 2, 4, 5, 6, 1, 3
 * 2, 4, 5, 1, 6, 3
 * 2, 4, 5, 1, 3, 6   -placed the largest element at correct position
 *
 * 2, 4, 1, 5, 3, 6
 * 2, 4, 1, 3, 5, 6
 *
 * 2, 1, 4, 3, 5, 6
 * 2, 1, 3, 4, 5, 6
 *
 * 1, 2, 3, 4, 5, 6   -- sorted
 * */
