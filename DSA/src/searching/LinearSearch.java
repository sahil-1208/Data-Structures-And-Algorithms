package searching;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {5, 6, 78, 3, 66, 88, 23};
        int index = linearSearch(arr, 23);

        if (index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found at index : " + index);
        }
    }

    public static int linearSearch(int[] arr, int value) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == value) {
                return index;
            }
        }
        return -1;
    }
}
