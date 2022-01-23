package leetcode;

public class LongestCommonPrefix2 {

    public static void main(String[] args) {
        System.out.println(Solution(new String[]{"flower", "flow", "flight"}));
        System.out.println(Solution(new String[]{"dog", "racecar", "car"}));
        System.out.println(Solution(new String[]{"cir", "car"}));
    }

    public static String Solution(String[] strs) {
        String minWorld = "";
        int minLength = 200;
        for (String str : strs) {
            int strLength = str.length();
            if (strLength < minLength) {
                minWorld = str;
                minLength = strLength;
            }
        }

        String prefix = "";
        outer:
        for (int i = minLength; i >= 0; i--) {
            prefix = minWorld.substring(0, i);
            for (String str : strs) {
                if (!str.substring(0, i).equals(prefix)) {
                    continue outer;
                }
            }
            return prefix;
        }
        return prefix;
    }
}
