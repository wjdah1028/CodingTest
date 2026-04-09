import java.util.*;

class Solution {
    boolean solution(String s) {
        
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean answer = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            else {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                }
                char top = stack.pop();
                if (s.charAt(i) == ')' && top != '(') {
                    answer = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}