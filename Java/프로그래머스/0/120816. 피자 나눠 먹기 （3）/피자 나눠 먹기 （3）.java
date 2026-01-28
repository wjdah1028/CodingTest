class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (slice * answer < n) {
                answer++;
            }
        }
        return answer;
    }
}