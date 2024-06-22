package Important_questions.arrays;

public class ContainsDuplicate {

    /*
     * Given an integer array nums, return true if any value appears at least twice in the array,
     *  and return false if every element is distinct.
     * */

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean containsDuplicate = containsDuplicate(nums);
        System.out.println(containsDuplicate);

    }

    public static boolean containsDuplicate(int[] nums) {
        int value;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            value = nums[i];
            for (int j = i + 1; j < size; j++) {
                if (nums[j] == value) {
                    return true;
                }
            }
        }
        return false;
    }
}
