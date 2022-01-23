package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RomanToInteger2 {

    public static void main(String[] args) {
        System.out.println(Solution("III"));
        System.out.println(Solution("LVIII"));
        System.out.println(Solution("MCMXCIV"));
    }

    private static int Solution(String s) {
        Map<String, Integer> stringMap = new HashMap<>() {{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }};

        int answer = 0;

        List<String> stringFactory = s.chars()
            .mapToObj(ch -> (char) ch)
            .map(String::valueOf)
            .collect(Collectors.toList());

        for (int i = 0; i < stringFactory.size(); i++) {
            int pre = stringMap.get(stringFactory.get(i));
            if (i < stringFactory.size() - 1) {
                int post = stringMap.get(stringFactory.get(i + 1));
                if (pre < post) {
                    answer -= pre;
                } else {
                    answer += pre;
                }
            } else {
                answer += stringMap.get(stringFactory.get(i));
            }
        }
        return answer;
    }
}
