package Practice2;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {10, 22, 23, 44, 54, 67, 68, 93};

        int result = binarySearch(arr, 54);

        if (result == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found at Index : " + result);
        }

    }

    public static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (value == arr[mid]) return mid;
            if (value > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
