class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] pn = phone_number.toCharArray();
        for (int i = 0; i < pn.length; i++) {
            if (i < pn.length - 4) {
                answer += "*";
            }
            else {
                answer += pn[i];
            }
        }
        return answer;
    }
}