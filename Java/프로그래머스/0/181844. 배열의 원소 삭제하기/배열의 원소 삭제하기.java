class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean dlt = false;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    dlt = true;
                    break;
                }
            }
            if (dlt) {
                count++;
            }
        }
        
        int[] answer = new int[arr.length - count];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean dlt = false;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    dlt = true;
                    break;
                }
            }
            
            if (!dlt) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}