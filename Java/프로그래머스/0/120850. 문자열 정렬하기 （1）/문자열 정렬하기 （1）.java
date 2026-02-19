import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        char[] c = my_string.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 48 && c[i] <= 57) {
                count++;
            }
        }
        int[] answer = new int[count];
        int idx = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 48 && c[i] <= 57) {
                answer[idx] = c[i] - '0';
                idx++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}