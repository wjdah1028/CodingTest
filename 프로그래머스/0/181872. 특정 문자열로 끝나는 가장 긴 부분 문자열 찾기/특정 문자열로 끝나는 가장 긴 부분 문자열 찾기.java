class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int a = myString.lastIndexOf(pat);
        answer = myString.substring(0, a + pat.length());
        return answer;
    }
}