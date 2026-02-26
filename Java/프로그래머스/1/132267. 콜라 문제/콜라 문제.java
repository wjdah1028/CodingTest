class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int exchange = 0;
        while (n >= a) {
            exchange = (n / a) * b;
            answer += exchange;
            n = exchange + (n % a);
        }
        return answer;
    }
}