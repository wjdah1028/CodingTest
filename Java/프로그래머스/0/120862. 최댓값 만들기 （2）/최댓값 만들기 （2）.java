class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max1) {
                max2 = max1;
                max1 = numbers[i];
            }
            else if (numbers[i] > max2) {
                max2 = numbers[i];
            }
            
            if (numbers[i] < min1) {
                min2 = min1;
                min1 = numbers[i];
            }
            else if (numbers[i] < min2) {
                min2 = numbers[i];
            }
        }
        int case1 = max1 * max2;
        int case2 = min1 * min2;
        answer = Math.max(case1, case2);
        return answer;
    }
}