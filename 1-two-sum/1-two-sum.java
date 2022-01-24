import java.util.HashMap;
import java.util.Map;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num =  nums[i];
            Integer minusIndex = indexMap.get(num);
            if (minusIndex != null) {
                return new int[]{minusIndex, i};
            }
            indexMap.put(target-num, i);
            
        }
        return new int[]{};
    }
}