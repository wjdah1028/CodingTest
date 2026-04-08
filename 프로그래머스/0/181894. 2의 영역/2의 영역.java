class Solution {
    public int[] solution(int[] arr) {
        
        int start = -1;
        int end = -1;

        // 2의 시작과 끝 찾기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) {
                    start = i;  // 첫 번째 2
                }
                end = i;        // 마지막 2
            }
        }

        // 2가 없는 경우
        if (start == -1) {
            return new int[]{-1};
        }

        // 부분 배열 크기 계산
        int size = end - start + 1;
        int[] answer = new int[size];

        // 값 복사
        for (int i = 0; i < size; i++) {
            answer[i] = arr[start + i];
        }

        return answer;
    }
}
