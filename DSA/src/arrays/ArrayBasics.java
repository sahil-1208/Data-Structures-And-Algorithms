package arrays;

import java.util.Scanner;

public class ArrayBasics {

    public static void main(String[] args) {

        int[] arr = takeInput();
        printArray(arr);
        System.out.println("Largest Element : " + largestElement(arr));
        System.out.println("Smallest Element : " + smallestElement(arr));

        reverse(arr);
        printArray(arr);

    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your Array");
        int size = sc.nextInt();
        System.out.println("Enter elements : ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int smallestElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void reverse(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }


}
