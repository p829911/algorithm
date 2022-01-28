class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int endSum = 0;

        for (int num : nums) {
            endSum = Math.max(endSum + num, num);
            maxSum = Math.max(endSum, maxSum);
        }
        return maxSum;
    }
}