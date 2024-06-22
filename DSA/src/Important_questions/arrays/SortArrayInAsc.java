package Important_questions.arrays;

public class SortArrayInAsc {

    public static void main(String[] args) {

        int[] arr = {54, 23, 44, 12, 78, 55, 22, 54};
        sortAsc(arr);
        printArray(arr);

    }

    public static void sortAsc(int[] arr) {

        int size = arr.length;
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
