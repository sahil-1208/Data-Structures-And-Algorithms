package Important_questions.arrays;

public class SortZeroOneTwo {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 2, 1, 2};
        sortZeroOneTwo(arr);
        //sort(arr);
        printArray(arr);

    }


    public static void sortZeroOneTwo(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    public static void sort(int[] arr) {
//        int low = 0, mid = 0, high = arr.length - 1;
//        while (mid <= high) {
//            switch (arr[mid]) {
//                case 0:
//                    int temp = arr[low];
//                    arr[low] = arr[mid];
//                    arr[mid] = temp;
//                    low++;
//                    mid++;
//                    break;
//                case 1:
//                    mid++;
//                    break;
//                case 2:
//                    temp = arr[mid];
//                    arr[mid] = arr[high];
//                    arr[high] = temp;
//                    high--;
//                    break;
//            }
//        }
//    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
