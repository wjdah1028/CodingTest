class Solution {
    public int solution(int n) {
        int answer = 0;
        int f = 1;
        int i = 1;
        while (f <= n) {
            f *= i;
            i++;
        }
        answer = i - 2;
        return answer;
    }
}