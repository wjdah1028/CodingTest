import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int idx = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                answer[idx++] = arr[i];
            }
            if (idx == k) {
                break;
            }
        }
        
        for (int i = idx; i < k; i++) {
            answer[i] = -1;
        }
        
        return answer;
    }
}