class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = n;
        int b = m;
        int gcd = n;
        
        // 최대공약수
        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        gcd = n;
        
        // 최소공배수
        int lcm = (a * b) / gcd;
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
}