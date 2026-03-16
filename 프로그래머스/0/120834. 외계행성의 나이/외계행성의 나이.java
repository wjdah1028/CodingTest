class Solution {
    public String solution(int age) {
        String answer = "";
        char[] c = String.valueOf(age).toCharArray();
        for (int i = 0; i < c.length; i++) {
            int num = c[i] - '0';
            answer += (char)('a' + num);
        }
        return answer;
    }
}