class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char temp = 0;
        
        char[] c = my_string.toCharArray();
        
        temp = c[num1];
        c[num1] = c[num2];
        c[num2] = temp;
        
        answer = String.valueOf(c);
        return answer;
    }
}