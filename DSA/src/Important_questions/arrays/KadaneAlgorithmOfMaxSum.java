package Important_questions.arrays;

public class KadaneAlgorithmOfMaxSum {

    public static void main(String[] args) {

        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(nums);
    }

    public static void kadane(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
            if (currentSum < 0) currentSum = 0;
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Max Sum : " + maxSum);
    }
}
