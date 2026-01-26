class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int se = Integer.MIN_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                se = max;
                max = numbers[i];
            }
            else if (numbers[i] > se) {
                se = numbers[i];
            }
            answer = max * se;
        }
        return answer;
    }
}