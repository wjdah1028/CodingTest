class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String a = my_string.substring(0, s);
        StringBuilder rsb = new StringBuilder(my_string.substring(s, e + 1)).reverse();
        String b = my_string.substring(e + 1);
        answer = a + rsb.toString() + b;
        return answer;
    }
}