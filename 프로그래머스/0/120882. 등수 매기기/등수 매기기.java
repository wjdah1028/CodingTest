class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        // 학생의 평균 점수 계산
        int[] sum = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }
        
        // 평균 점수 비교
        for (int i = 0; i < score.length; i++) {
            int rank = 1;
            for (int j = 0; j < score.length; j++) {
                if (sum[j] > sum[i]) {
                    rank = rank + 1;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}