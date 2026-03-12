class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            int s1 = parts[i][0];
            int s2 = parts[i][1];
            
            sb.append(my_strings[i].substring(s1, s2+1));
        }
        answer = sb.toString();
        return answer;
    }
}