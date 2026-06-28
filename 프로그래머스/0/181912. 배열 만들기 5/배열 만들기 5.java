import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            
            // s 문자열로 잘라내기
            String st = intStrs[i].substring(s, s + l);
            
            // 잘라낸 문자열 정수 변환
            int str = Integer.parseInt(st);
            
            // 정수 k와 비교
            if (str > k) {
                list.add(str);
            }
            
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i ++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}