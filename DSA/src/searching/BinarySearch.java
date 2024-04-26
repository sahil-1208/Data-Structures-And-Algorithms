package searching;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {5, 6, 8, 3, 16, 18, 23};
        int index = binarySearch(arr, 33);

        if (index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found at index : " + index);
        }

    }

    public static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (value == arr[mid]) return mid;
            else if (value > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
