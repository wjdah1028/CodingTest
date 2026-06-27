import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            
            // 숫자를 문자열로 변환
            String s = String.valueOf(i);
            boolean plag = true;
            
            // 0과 5가 포함
            for (char c : s.toCharArray()) {
                if (c != '0' && c != '5') {
                    plag = false;
                    break;
                }
            }
            
            if (plag == true) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}