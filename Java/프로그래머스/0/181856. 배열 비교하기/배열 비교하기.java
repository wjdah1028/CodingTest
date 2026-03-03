class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        if (arr1.length > arr2.length) { // 배열의 길이가 다르고 arr1이 더 클 때
            answer = 1;
        }
        else if (arr1.length < arr2.length) { // 배열의 길이가 다르고 arr2가 더 클 때
            answer = -1;
        }
        else if (arr1.length == arr2.length) { // 배열의 길이가 같을때
            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
            }
            for (int i = 0; i < arr2.length; i++) {
                sum2 += arr2[i];
            }
            if (sum1 > sum2) {
                answer = 1;
            }
            else if (sum1 < sum2) {
                answer = -1;
            }
            else if (sum1 == sum2) {
                answer = 0;
            }
        }
        return answer;
    }
}