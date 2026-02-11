import java.util.Arrays;

class Solution {
    public int solution(int[] d, long budget) {
        int answer = 0;
        long sum = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) {
                break;
            }
            else {
                answer++;
            }
        }
        return answer;
    }
}