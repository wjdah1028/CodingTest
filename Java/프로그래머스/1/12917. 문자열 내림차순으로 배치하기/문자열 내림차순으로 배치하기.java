import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        answer = String.valueOf(c);
        StringBuilder sb = new StringBuilder(answer);
        sb.reverse();
        return sb.toString();
    }
}