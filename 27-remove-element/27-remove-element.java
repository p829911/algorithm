class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i += 1;
            }
            System.out.println(Arrays.toString(nums));
        }
        return i;
    }
}