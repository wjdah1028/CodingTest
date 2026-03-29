import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        char[] c = myStr.toCharArray();
        String s = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'b' || c[i] == 'c') {
                if (!s.equals("")) {
                    list.add(s);
                }
                s = "";
            }
            else {
                s += c[i];
            }
        }
        
        if (!s.equals("")) {
            list.add(s);
        }
        
        answer = list.toArray(new String[0]);
        
        if (list.size() == 0) {
            return new String[]{"EMPTY"};
        }

        return answer;
    }
}