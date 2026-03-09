import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        int type = set.size(); // 포켓몬 종류
        int count = nums.length / 2; // 가져갈 수 있는 포켓몬 개수
        answer = Math.min(type, count);
        return answer;
    }
}