import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            char stnum = num.charAt(i);
            sum += num.charAt(i) - '0';
        }
        answer = sum;

        return answer;
    }
}