class Solution {
    public String[] solution(String[] names) {
        int count = (names.length + 4) / 5;
        String[] answer = new String[count];
        int idx = 0;
        for (int i = 0; i < names.length; i+=5) {
            answer[idx] = names[i];
            idx++;
        } 
        return answer;
    }
}