package Practice;

import java.util.Arrays;

public class ChocolateDistribution {

    public static void main(String[] args) {

        int[] chocolates = {3, 4, 1, 9, 56, 7, 9, 12};

        int chocolateDifference = chocolateDistribute(chocolates, chocolates.length, 5);
        System.out.println("Minimum Difference Between Student Having Max Chocolate and Min Chocolate : " + chocolateDifference);


    }


    //  totalPackets = chocolates.length
    //  m = no of students
    //


    public static int chocolateDistribute(int[] chocolates, int totalPacket, int m) {
        Arrays.sort(chocolates);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < totalPacket; i++) {
            int diff = chocolates[i + m - 1] - chocolates[i];
            if (diff < min) min = diff;
        }
        return min;
    }
}
