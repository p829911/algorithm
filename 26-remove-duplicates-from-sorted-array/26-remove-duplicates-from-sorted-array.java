class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int end = nums.length;
        while (index < end - 1) {
            if (nums[index] == nums[index + 1]) {
                for (int i = index; i < end - 1 ; i++) {
                    nums[i] = nums[i + 1];
                }
                end -= 1;
            } else {
                index += 1;
            }
        }
        return end;
    }
}