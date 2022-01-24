class Solution {
    public String longestCommonPrefix(String[] strs) {
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
        outer: for (int i = minLength; i >= 0; i--) {
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