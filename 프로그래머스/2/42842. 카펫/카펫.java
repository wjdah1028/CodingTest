public class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int height = 3; height <= total; height++) { // 가운데에 노란색이 들어와야 되므로 3칸부터 시작
            if (total % height != 0) {
                continue;
            }
            int width = total / height;
            if (width < height) {
                break;
            }

            // 노랑색 영역 검증
            if ((width - 2) * (height - 2) == yellow) {
                return new int[]{width, height};
            }
        }
        return new int[]{};
    }
}