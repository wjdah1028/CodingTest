import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        char[] c = s.toCharArray();
        
        int[] answer = new int[c.length];
        
        int t = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            answer[t++] = c[i] - '0';
        }
        return answer;
    }
}