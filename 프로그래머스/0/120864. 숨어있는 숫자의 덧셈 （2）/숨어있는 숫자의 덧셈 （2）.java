class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int n = 0;
        String s = String.valueOf(n);
        char[] c = my_string.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' && c[i] <= '9') {
                n = n * 10 + (c[i] - '0');
            }
            else {
                answer += n;
                n = 0;
            }
        }
        answer += n;
        return answer;
    }
}