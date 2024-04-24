package arrays;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] arr = takeInput();
        printArray(arr);

    }

    public static void printArray(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        System.out.println("Enter the columns");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
}
