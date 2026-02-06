class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] c = my_string.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 65 && c[i] <= 90) {
                c[i] = (char)(c[i] + 32);
            }
            else if (c[i] >= 97 && c[i] <= 122) {
                c[i] = (char)(c[i] - 32);
            }
        }
        answer = String.valueOf(c);
        return answer;
    }
}