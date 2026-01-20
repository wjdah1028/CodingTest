class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if (n % 10 >= 0 && n % 10 <= 100)
            answer = n * 12000 + 2000 * k - ((n/10) * 2000);
        else
            answer = n * 12000 + k * 2000;
        return answer;
    }
}