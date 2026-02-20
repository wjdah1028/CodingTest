class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] c = cipher.toCharArray();
        for (int i = code - 1; i < c.length; i += code) {
            answer += String.valueOf(c[i]);
        }
        return answer;
    }
}