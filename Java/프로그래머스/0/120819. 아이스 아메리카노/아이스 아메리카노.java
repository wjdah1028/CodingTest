class Solution {
    public int[] solution(int money) {
        int count = money / 5500;
        int e = money % 5500;
        
        int[] answer = new int[]{count, e};
        return answer;
    }
}