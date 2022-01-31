class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;

        for (int i = 1; i <= x / 2; i++) {
            int next = i+1;
            if (((i * i) <= x && ((next * next) > x) || (next * next) < 0)) {
                return i;
            }
        }
        return 1;
    }
}