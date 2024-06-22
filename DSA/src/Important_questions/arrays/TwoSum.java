package Important_questions.arrays;

public class TwoSum {

    /*
    * Given an array of integers nums and an integer target,
    * return indices of the two numbers such that they add up to target.
    * */

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        twoSum(nums, 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] outPut = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    outPut[0] = i;
                    outPut[1] = j;
                    return outPut;
                }
            }
        }
        return outPut;
    }
}
