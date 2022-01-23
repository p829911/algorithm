package leetcode;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String s = String.valueOf(x);

        // Stream 사용 1
        String collect = IntStream.range(0, s.length())
            .boxed()
            .sorted(Comparator.reverseOrder())
            .map(s::charAt)
            .map(String::valueOf)
            .collect(Collectors.joining());

        // Stream 사용 2
        String collect1 = s.chars()
            .mapToObj(ch -> (char) ch)
            .map(String::valueOf)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());

        // StringBuilder, StringBuffer를 사용한 문자열 뒤집기
        StringBuilder sb = new StringBuilder(s);
        String reverseString = sb.reverse().toString();

        return s.equals(reverseString);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println("9_987_654_321");
        System.out.println(Integer.MAX_VALUE);
    }
}
