class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pP = 0;
        int yY = 0;
        
        char[] c = s.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'p' || c[i] == 'P') {
                pP++;
            }
            else if (c[i] == 'y' || c[i] == 'Y') {
                yY++;
            }
        }
        
        if (pP == yY) {
            answer = true;
        }
        else if (pP != yY) {
            answer = false;
        }

        return answer;
    }
}