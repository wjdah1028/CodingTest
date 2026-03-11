import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> h = new HashMap<>();
        
        // HashMap으로 마라톤 선수들의 이름과 인원수 파악
        for (int i = 0; i < participant.length; i++) {
            if (h.containsKey(participant[i])) {
                h.put(participant[i], h.get(participant[i]) + 1);
            }
            else {
                h.put(participant[i], 1);
            }
        }
        
        // 완주 배열 돌면서 들어온 사람은 -1
        for (int i = 0; i < completion.length; i++) {
            h.put(completion[i], h.get(completion[i]) - 1);
        }
        
        // completion 배열에서 -1이 안되고 value 값이 양수인 사람을 찾아 반환
        String[] keys = h.keySet().toArray(new String[0]);
        for (int i = 0; i < keys.length; i++) {
            if (h.get(keys[i]) > 0) {
                answer = keys[i];
            }
        }
        return answer;
    }
}