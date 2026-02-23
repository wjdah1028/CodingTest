class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        if (my_string.contains(alp)) {
            my_string = my_string.replace(alp, alp.toUpperCase());
            answer = my_string;
        }
        else
            answer = my_string;
        return answer;
    }
}