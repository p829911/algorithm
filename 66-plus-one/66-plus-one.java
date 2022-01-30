class Solution {
    public int[] plusOne(int[] digits) {
        int checkIndex = digits.length - 1;

        while (true) {

            if (digits[checkIndex] != 9) {
                digits[checkIndex] += 1;
                return digits;
            } else {
                digits[checkIndex--] = 0;
            }

            if (checkIndex == -1) {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                System.arraycopy(digits, 0, newDigits, 1, digits.length);
                return newDigits;
            }
        }
    }
}