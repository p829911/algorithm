class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        String reverseString = sb.reverse().toString();

        return s.equals(reverseString);
    }
}