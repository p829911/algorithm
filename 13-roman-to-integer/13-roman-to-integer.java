class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> stringMap = new HashMap<>() {{
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
        }};

        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Integer pre = stringMap.get(s.charAt(i));
            if (i < s.length() - 1) {
                Integer post = stringMap.get(s.charAt(i+1));
                if (pre < post) {
                    answer -= pre;
                } else {
                    answer += pre;
                }
            } else {
                answer += pre;
            }
        }
        return answer;
    }
}