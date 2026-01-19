class Solution {
    public int solution(String s) {
        int answer = 0;
        int a = Integer.parseInt(s);
        if (a > 0 && a < 99999) {
            answer = a;
        }
        else if (a > -99999 && a < 0) {
            answer = a;
        }
        return answer;
    }
}