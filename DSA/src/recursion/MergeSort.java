package recursion;

public class MergeSort {

    public static void main(String[] args) {

        int[] nums = {6, 3, 9, 5, 2, 8};
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(" Sorted Array : ");
        print(nums);

    }

    public static void mergeSort(int[] arr, int start, int end) {

        if (start >= end) return;

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, mid, start, end);
    }

    public static void merge(int[] arr, int mid, int start, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= end) {

            if (arr[i] < arr[j]) {
                temp[t] = arr[i];
                i++;
            } else {
                temp[t] = arr[j];
                j++;
            }
            t++;
        }

        while (i <= mid) {
            temp[t++] = arr[i++];
        }

        while (j <= end) {
            temp[t++] = arr[j++];
        }

        for (t = 0, i = start; t < temp.length; t++, i++) {
            arr[i] = temp[t];
        }

    }

    public static void print(int[] arr) {

        for (int print : arr) {
            System.out.print(print + " ");
        }
        System.out.println();
    }
}
