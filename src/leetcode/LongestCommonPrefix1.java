package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix1 {

    public static void main(String[] args) {
        System.out.println(Solution(new String[]{"flower", "flow", "flight"}));
        System.out.println(Solution(new String[]{"dog", "racecar", "car"}));
        System.out.println(Solution(new String[]{"cir", "car"}));
    }

    public static String Solution(String[] strs) {

        Integer minLength = Arrays.stream(strs)
            .map(String::length)
            .reduce(Integer.MAX_VALUE, Math::min);

        StringBuilder sb = new StringBuilder(minLength);

        for (int i = 0; i < minLength; i++) {
            int localI = i;
            long count = Arrays.stream(strs)
                .map(s -> s.charAt(localI))
                .distinct()
                .count();
            if (count == 1) {
                sb.append(strs[0].charAt(localI));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
