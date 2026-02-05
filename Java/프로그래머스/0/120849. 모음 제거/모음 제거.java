class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] c = my_string.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                continue;
            }
            else {
                answer += c[i];
            }
        }
        return answer;
    }
}