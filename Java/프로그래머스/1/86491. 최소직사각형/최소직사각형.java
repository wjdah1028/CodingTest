class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int a = 0; // 가로 최대
        int b = 0; // 세로 최대
        for (int i = 0 ; i < sizes.length; i++) {
            
            int c = sizes[i][0];
            int d = sizes[i][1];
            
            int big;
            int small;
            
            if (c > d) {
                big = c;
                small = d;
            }
            else {
                big = d;
                small = c;
            }
            
            if (big > a) {
                a = big;
            }
            
            if (small > b) {
                b = small;
            }
            answer = a * b;
        }
        return answer;
    }
}