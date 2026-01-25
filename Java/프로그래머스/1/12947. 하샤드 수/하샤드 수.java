class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        String s = String.valueOf(x);
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            sum += c[i] - '0';
        }
        
        if (x % sum == 0) {
            answer = true;
        }
        else
            answer = false;
        
        return answer;
    }
}