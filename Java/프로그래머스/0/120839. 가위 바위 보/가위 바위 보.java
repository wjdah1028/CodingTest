class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] c = rsp.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '2') {
                answer += String.valueOf(0);
            }
            else if (c[i] == '0') {
                answer += String.valueOf(5);
            }
            else if (c[i] == '5') {
                answer += String.valueOf(2);
            }
        }
        return answer;
    }
}