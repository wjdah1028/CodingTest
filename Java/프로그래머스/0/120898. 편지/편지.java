class Solution {
    public int solution(String message) {
        int answer = 0;
        char[] m = message.toCharArray();
        answer = m.length * 2;
        return answer;
    }
}