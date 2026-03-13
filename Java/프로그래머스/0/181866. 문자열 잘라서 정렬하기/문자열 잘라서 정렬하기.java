import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] s = myString.split("x");
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals("")) {
                count++;
            }
        }
        
        String[] answer = new String[count];
        int idx = 0;
        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals("")) {
                answer[idx] = s[i];
                idx++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}