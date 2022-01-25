class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();

        if (needleLength == 0 || haystack.equals(needle)) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}