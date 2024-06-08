package Practice;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {12, 56, 8, 282, 88};
        int index = binarySearch(arr, 90);

        if (index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element found at index : " + index);
        }

    }

    public static int binarySearch(int[] arr, int value) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == value) return mid;
            if (arr[mid] < value) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
