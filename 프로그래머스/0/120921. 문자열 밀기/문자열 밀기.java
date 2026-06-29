class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuilder sb1 = new StringBuilder(A);
        StringBuilder sb2 = new StringBuilder(B);
        
        if (A.equals(B)) {
            return 0;
        }
        
        for (int i = 0; i < sb1.length(); i++) {
            
            // 마지막 문자 꺼내기
            char c = sb1.charAt(sb1.length() - 1);
            
            // 맨 앞으로 삽입
            sb1 = sb1.insert(0, c);
            
            // 꺼낸 문자 삭제
            sb1.deleteCharAt(sb1.length() - 1);
            
            // 횟수 증가
            answer++;
            
            // B와 비교
            if (sb1.toString().equals(sb2.toString())) {
                return answer;
            }
        }
        
        return -1;
    }
}