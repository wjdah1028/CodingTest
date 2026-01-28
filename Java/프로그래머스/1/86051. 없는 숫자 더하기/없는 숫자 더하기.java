class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for (int i = 0; i <= 9; i++) {
            boolean nothing = false;
            
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    nothing = true;
                    break;
                }
            }
            
            if (!nothing) {
                answer += i;
            }
        }
        return answer;
    }
}