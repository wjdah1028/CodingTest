class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int a = p.length();
        long b = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - a; i++) {
            String sub = t.substring(i, i + a);
            long subNum = Long.parseLong(sub);
            
            if (subNum <= b) {
                answer++;
            }
        }
        return answer;
    }
}