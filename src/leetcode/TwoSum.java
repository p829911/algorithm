package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer minusIndex = indexMap.get(num);
            if (minusIndex != null) {
                return new int[]{minusIndex, i};
            }
            indexMap.put(target - num, i);
            System.out.println(indexMap);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] answer = twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int i : answer) {
            System.out.println(i);
        }
    }

}
