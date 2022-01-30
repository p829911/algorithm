class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitList = s.split(" ");
        return splitList[splitList.length - 1].length();
    }
}