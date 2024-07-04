package Important_questions.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 1, 2, 3};
        bubbleSort(arr);
        for (int sort : arr) {
            System.out.print(sort + " ");
        }

    }

    public static void bubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }
}
