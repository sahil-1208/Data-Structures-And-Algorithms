package Important_questions.arrays;

public class SubArrays {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        printSubArray(arr);

        //maxSubArray(arr);

    }

    public static void printSubArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxSubArray(int[] arr) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }
                System.out.println("Current Sum : " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Sum : " + maxSum);
    }

}


