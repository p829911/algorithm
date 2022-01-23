package leetcode;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class RomanToInteger1 {

    public static void main(String[] args) {
        System.out.println(Solution("III"));
        System.out.println(Solution("LVIII"));
        System.out.println(Solution("MCMXCIV"));
    }

    private static int Solution(String s) {
        int answer = 0;

        LinkedList<Roman> stringFactory = s.chars()
            .mapToObj(ch -> (char) ch)
            .map(String::valueOf)
            .map(Roman::valueOf)
            .collect(Collectors.toCollection(LinkedList::new));

        while (!stringFactory.isEmpty()) {
            Roman pre = stringFactory.poll();
            Roman post = stringFactory.peek();
            if (post != null) {
                if (pre.compareTo(post) < 0) {
                    post = stringFactory.poll();
                    answer += post.getValue() - pre.getValue();
                    continue;
                }
            }
            answer += pre.getValue();
        }

        return answer;
    }

    private enum Roman {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private final int value;

        Roman(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
