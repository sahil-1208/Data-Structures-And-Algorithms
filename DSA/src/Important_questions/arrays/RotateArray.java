package Important_questions.arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateArray(nums, 2);

        for (int arr : nums) {
            System.out.print(arr + " ");
        }

    }


    public static void rotateArray(int[] nums, int k) {

        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);  // 7654321
        reverse(nums, 0, k - 1);            // 6754321
        reverse(nums, k, nums.length - 1);       // 6712345
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
