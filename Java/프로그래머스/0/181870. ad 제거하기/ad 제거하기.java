class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                
            }
            else {
                count++;
            }
        }
        String[] answer = new String[count];
        int idx = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                
            }
            else {
                answer[idx] = strArr[i];
                idx++;
            }
        }
        return answer;
    }
}