package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
//        int[] arr1 = {3, 4, 5, 6};
//        int[] arr2 = {1, 7, 8, 9};
//
//        int[] merged = merge(arr1, arr2);
//
//        System.out.println("Sorted Array : " + Arrays.toString(merged));

        int[] originalArray = {3, 1, 4, 2};

        int[] sortedArray = mergeSort(originalArray);

        System.out.println("Original Array : " + Arrays.toString(originalArray));

        System.out.println("Sorted Array : " + Arrays.toString(sortedArray));


    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;
        int minIndex = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, minIndex));
        int[] right = mergeSort(Arrays.copyOfRange(arr, minIndex, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArrays = new int[arr1.length + arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArrays[index] = arr1[i];
                index++;
                i++;
            } else {
                mergedArrays[index] = arr2[j];
                index++;
                j++;
            }
        }
        while (i < arr1.length) {
            mergedArrays[index] = arr1[i];
            index++;
            i++;
        }
        while (j < arr2.length) {
            mergedArrays[index] = arr2[j];
            index++;
            j++;
        }

        return mergedArrays;
    }

}
/*merge sort algorithm typically works:
Divide: Divide the unsorted array into two halves recursively until each sub-array contains only one element.
 This is the base case of the recursion.
Conquer: Once the base case is reached (sub-arrays of size 1),
merge the sub-arrays back together into sorted order.
This is done by comparing the elements of the two sub-arrays and combining them into a single sorted array.
Combine: Repeat the merging process recursively until the entire array is sorted.
The merging step is the key to merge sort's efficiency.
It takes two sorted sub-arrays and efficiently combines them into a single sorted array.
 This is achieved by comparing the elements of the two sub-arrays and placing them in the correct order.
* */