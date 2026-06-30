import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            
            // HashMap에 원소 삽입
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        
        int max = 0; // 최빈값 설정
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }
        
        int count = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            entry.getKey(); // 숫자
            entry.getValue(); // 횟수
            if (entry.getValue() == max) {
                answer = entry.getKey();
                count++;
            }
        }
        
        if (count >= 2) {
            answer = -1;
        }
        
        return answer;
    }
}