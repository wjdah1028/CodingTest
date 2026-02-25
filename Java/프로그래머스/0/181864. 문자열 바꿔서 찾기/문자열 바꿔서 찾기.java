class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String s = "";
        char[] c = myString.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'A') {
                c[i] = 'B';
            }
            else if (c[i] == 'B') {
                c[i] = 'A';
            }
        }
        s = String.valueOf(c);
        
        if (s.contains(pat)) {
            answer = 1;
        }
        else
            answer = 0;
        return answer;
    }
}