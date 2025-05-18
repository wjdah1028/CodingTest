import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>(); // 공백 스택 생성
        st.push(arr[0]); // 첫번째 값은 삽입하고 시작
        
        for (int i = 1; i < arr.length; i++) { // 인덱스 0번은 이미 삽입했기 때문에 0부터 시작
            if (arr[i] != arr[i-1]) {
                st.push(arr[i]);
            }
        }
        
        // 스택에 있는 Integer 타입을 int 타입으로 출력
        // 출력할때 역순으로 출력
        int[] answer = new int[st.size()];
        for (int j = st.size() - 1; j >= 0; j--) { // 갯수가 3개이면 인덱스는 0부터 시작하니깐 -1을 빼줌
            answer[j] = st.pop(); // LIFO이므로 역순으로 출력
        }
        return answer;
    }
}