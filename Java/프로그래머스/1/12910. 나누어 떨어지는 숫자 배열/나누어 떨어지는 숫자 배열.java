import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        if (answer.length == 0) {
            return new int[]{-1};
        }
        
        Arrays.sort(answer);
        return answer;
    }
}