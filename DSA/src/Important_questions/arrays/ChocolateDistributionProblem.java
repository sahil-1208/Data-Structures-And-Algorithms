package Important_questions.arrays;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static void main(String[] args) {

        int[] chocolates = {3, 4, 1, 9, 56, 7, 9, 12};

        int chocolateDifference = chocolateDifference(chocolates, chocolates.length, 5);
        System.out.println("Minimum Difference Between Student Having Max Chocolate and Min Chocolate : " + chocolateDifference);


    }

    public static int chocolateDifference(int[] chocolates, int packets, int m) {
                                                             // m = No of Students
        Arrays.sort(chocolates);                            // 1,3,4,7,9,9,12,56
        int min = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < packets; i++) {
            int diff = chocolates[i + m - 1] - chocolates[i];   // calculate min difference
            if (diff < min) min = diff;     // check if difference is smaller than min , if yes do min = diff
        }
        return min;

    }

}
