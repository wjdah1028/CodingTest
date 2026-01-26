class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long max = Math.max(a,b);
        long min = Math.min(a,b);
        
        if (a == b) {
            answer = (long)a;
        }
        else if (a != b) {
            answer = (max - min + 1) * (max + min) / 2;
        }
        return answer;
    }
}