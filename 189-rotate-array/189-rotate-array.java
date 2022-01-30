class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        
        int[] pre = Arrays.copyOfRange(nums, 0, nums.length - k);
        int[] post = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        System.arraycopy(pre, 0, nums, k, nums.length - k);
        System.arraycopy(post, 0, nums, 0, k);
        
    }
}