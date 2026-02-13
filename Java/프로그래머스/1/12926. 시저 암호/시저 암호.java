class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            
            if (c[i] == ' ') {
                answer += ' ';
                continue;
            }
            
            char a = (char)(c[i] + n);
            
            if (c[i] >= 'a' && c[i] <= 'z') {
                if (a > 'z') {
                    a -= 26;
                }
            }
            
            if (c[i] >= 'A' && c[i] <= 'Z') {
                if (a > 'Z') {
                    a -= 26;
                }
            }
            
            answer += a;
        }
        return answer;
    }
}