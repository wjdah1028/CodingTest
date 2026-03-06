class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (i == 0) {
                c[i] = Character.toUpperCase(c[i]);
            }
            else if (c[i-1] == ' ') {
                c[i] = Character.toUpperCase(c[i]);
            }
            else {
                c[i] = Character.toLowerCase(c[i]);
            }
        }
        answer = String.valueOf(c);
        return answer;
    }
}