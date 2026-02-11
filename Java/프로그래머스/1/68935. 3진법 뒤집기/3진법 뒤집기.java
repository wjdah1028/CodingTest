class Solution {
    public int solution(int n) {
        int answer = 0;
        String a, b = "";
        a = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        b = sb.toString();
        answer = Integer.parseInt(b, 3);
        return answer;
    }
}