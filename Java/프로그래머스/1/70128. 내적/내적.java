class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                sum = a[i] * b[i];
            }
            answer += sum;
        }
        return answer;
    }
}