public class maximumSumSubarray {
    public static void main (String[] args){
        // Kadanes Algorithm
        //Problem Statement: Given an integer array, find the contiguous subarray with the largest sum.
        /* [-2, 1, -3, 4, -1, 2, 1, -5, 4]

            Answer = 6

            Best subarray:
            [4, -1, 2, 1]

            Sum = 4 + (-1) + 2 + 1 = 6 
            */
        /* 
        🧠 Core Intuition

        While scanning the array, at every element we have two choices:

        Choice 1 — Continue the current subarray
                    currentSum + nums[i]
 
        Choice 2 — Throw away the previous subarray and start fresh
                    nums[i]

        Why would we start fresh?

        Because if the previous currentSum is negative, carrying it forward will only make the future sum smaller.

        Example:

        currentSum = -5
        current number = 10

        Continue:

        -5 + 10 = 5

        Start fresh: 10

        So we should start at 10.

        Therefore, at every element:

        currentSum = Math.max(nums[i], currentSum + nums[i]);
        */

        int[] nums = {-2, 1, -3, 4, -1, 2, 1};
        int result=maxSubArray(nums);
        System.out.println(result);

    }

    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
        int globalMax = nums[0];

        for (int i = 0; i < nums.length; i++) {

            currentSum = Math.max(
                nums[i],
                currentSum + nums[i]
            );

            globalMax = Math.max(
                globalMax,
                currentSum
            );
        }

        return globalMax;
    }
    
}
