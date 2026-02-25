class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] - '0' == k ) {
                answer = i + 1;
                break;
            }
            else
                answer = -1;
        }
        return answer;
    }
}