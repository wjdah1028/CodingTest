class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] c = number.toCharArray();
        for (int i = 0; i < c.length; i++) {
            answer += c[i] - '0';
        }
        answer = answer % 9;
        return answer;
    }
}