class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        s = s.replaceAll(" +", " ");
        String[] splitList = s.split(" ");
        return splitList[splitList.length - 1].length();
    }
}