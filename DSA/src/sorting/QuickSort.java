package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] originalArray = {3, 1, 4, 2, 6, 8, 5};

        System.out.println("Original Array : " + Arrays.toString(originalArray));

        quickSort(originalArray);

        System.out.println("Sorted Array : " + Arrays.toString(originalArray));

    }

    private static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }

    public static void quickSortHelper(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(arr, left, right);
            quickSortHelper(arr, left, pivotIndex - 1);
            quickSortHelper(arr, pivotIndex + 1, right);
        }
    }

    public static int pivot(int[] arr, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (arr[i] < arr[pivotIndex]) {
                swapIndex++;
                swap(arr, swapIndex, i);
            }
        }
        swap(arr, pivotIndex, swapIndex);
        return swapIndex;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
/*quicksort algorithm typically works:
Choose a pivot element from the array.
This pivot can be selected in different ways, such as the first element, the last element, the median of three elements, etc.
Partition the array into two sub-arrays: elements less than the pivot and elements greater than the pivot.
This is often done using two pointers that move towards each other,
swapping elements as necessary to ensure the pivot ends up in its final sorted position.
Recursively apply the quicksort algorithm to the sub-arrays formed by the partitioning step.
Combine the sorted sub-arrays to form the final sorted array.
* */
