import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i];
        }
        Arrays.sort(answer, new Comparator<String>() {
           public int compare(String a, String b) {
               if (a.charAt(n) == b.charAt(n)) {
                   return a.compareTo(b);
               }
               return a.charAt(n) - b.charAt(n);
           } 
        });
        return answer;
    }
}