class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] c = s.toCharArray();
        char x = c[0]; // x
        int a = 0; // x 개수
        int b = 0; // x가 아닌 개수
        
        for (int i = 0; i < c.length; i++) {
            
            if (a == 0) {   // 새 구간 시작
                x = c[i];
            }

            if (c[i] == x) {
                a++;
            }
            else {
                b++;
            }
            
            if (a == b) {
                answer++;
                a = 0;
                b = 0;
            }
        }
        
        if (a != 0) {  // 남은 문자열 처리
            answer++;
        }
        return answer;
    }
}