class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] c = myString.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] < 108) {
                c[i] = 'l';
            }
            answer = String.valueOf(c);
        }
        return answer;
    }
}