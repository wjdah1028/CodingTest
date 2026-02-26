class Solution {
    public String solution(String n_str) {
        String answer = "";
        int start = 0;
        char[] c = n_str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] != '0') {
                start = i;
                break;
            }
        }
        
        for (int i = start; i < c.length; i++) {
            answer += c[i];
        }
        return answer;
    }
}