class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c.length != 4 && c.length != 6) {
                answer = false;
            }
            else if (c[i] < 48 || c[i] > 58) {
                answer = false;
            }
        }
        return answer;
    }
}