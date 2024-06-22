package Important_questions.arrays;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] height = {4, 2, 0, 6, 3, 2, 5};
        int trappedWater = trappingRainWater(height);

        System.out.println("Trapped Rain Water : " + trappedWater);


    }

    public static int trappingRainWater(int[] height) {

        int n = height.length;

        //leftMaxBoundary -- auxiliary array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        //RightMaxBoundary -- auxiliary array
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedRainWater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);           // waterLevel = min(leftMaxBoundary,RightMaxBoundary)
            trappedRainWater += waterLevel - height[i];                  // trappedRainWater = waterLevel - height[i];
        }
        return trappedRainWater;

    }


}
