import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = Long.toString(n);
        char[] arr = a.toCharArray();
        Arrays.sort(arr);
        String temp = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            temp += arr[i];
        }
        answer = Long.parseLong(temp);
        return answer;
    }
}