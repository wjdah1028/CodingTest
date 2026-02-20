class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer += i;
            }
        }
        StringBuilder sb = new StringBuilder(answer);
        sb = sb.reverse();
        String reanswer = sb.toString();
        answer = answer + "0" + reanswer;
        return answer;
    }
}