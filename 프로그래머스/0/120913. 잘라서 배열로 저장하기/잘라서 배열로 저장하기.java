class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() + n - 1) / n];
        int idx = 0;
        for (int i = 0; i < my_str.length(); i += n) {
            answer[idx] = my_str.substring(i, Math.min(n + i, my_str.length()));
            idx++;
        }
        return answer;
    }
}