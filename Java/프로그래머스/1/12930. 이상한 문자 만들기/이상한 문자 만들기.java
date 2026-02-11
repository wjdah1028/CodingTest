class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                idx = 0;
                answer += ' ';
            }
            else {
                if (idx % 2 == 0) {
                    answer += Character.toUpperCase(c[i]);
                }
                else
                    answer += Character.toLowerCase(c[i]);
                idx++;
            }
        }
        return answer;
    }
}