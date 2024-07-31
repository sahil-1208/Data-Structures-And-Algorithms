package recursion;

public class QuickSort {

    public static void main(String[] args) {

        int[] nums = {6, 3, 9, 8, 2, 5};
        quicksort(nums);

        for (int print : nums) {
            System.out.print(print + " ");
        }

    }

    public static void quicksort(int[] arr) {
        quicksortHelper(arr, 0, arr.length - 1);
    }

    public static void quicksortHelper(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivotIndex = partition(arr, start, end);
        quicksortHelper(arr, start, pivotIndex - 1);
        quicksortHelper(arr, pivotIndex + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }

}
