class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int num = 0;
        
        String[] parts = s.split(" ");
        for (int i = 0; i < parts.length; i++) {
            num = Integer.parseInt(parts[i]);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        answer = min + " " + max;
        return answer;
    }
}