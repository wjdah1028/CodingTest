class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] c = my_string.toCharArray();
        for (int i = 0; i < c.length; i++) {
            boolean b = false;
            for (int j = 0; j < indices.length; j++) {
                if (i == indices[j]) {
                    b = true;
                }
            }
            if (b == false) {
                answer += c[i];
            }
        }
        return answer;
    }
}