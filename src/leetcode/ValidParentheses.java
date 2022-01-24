package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("{[()]}"));
        System.out.println(isValid("([)]"));
    }

    static HashMap<Character, Character> characterMap = new HashMap<>() {{
        put('(', ')');
        put('[', ']');
        put('{', '}');
    }};

    public static boolean isValid(String s) {

        Stack<Character> stringStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!stringStack.isEmpty()) {
                Character closedValue = characterMap.get(stringStack.peek());
                if (closedValue != null && s.charAt(i) == closedValue) {
                    stringStack.pop();
                    continue;
                }
            }
            stringStack.push(s.charAt(i));

        }

        return stringStack.isEmpty();
    }
}
