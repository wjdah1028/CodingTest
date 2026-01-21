class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int[] a = new int[num_list.length];
        int b = 0;
        for (int i = num_list.length - 1; i >= 0; i--) {
            a[b] = num_list[i];
            b++;
        }
        answer = a;
        return answer;
        // 깃허브 오류로 다시 올리기
    }
}