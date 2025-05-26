import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> qu = new LinkedList<>(); // 공백 큐 생성
        
        for (int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i]) / speeds[i]; // 개발이 종료되기까지의 시간
            if ((100 - progresses[i]) % speeds[i] == 0) { // 개발이 종료가 될때
                qu.add(day); // 큐에 삽입
            }
            else { // 개발이 아직 종료가 안됐을때
                qu.add(day + 1); // 개발이 종료될때 까지의 날짜를 늘림
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>(); // 배포할때 몇 개가 한 번에 나가는 저장하는 ArrayList
        int out = qu.poll(); // 첫 번째 기능을 먼저 빼주기
        int count = 1; // 첫 번째 기능은 무조건 빼기 떄문에 1
        int size = qu.size(); // 큐에 남아 있는 기능 개수 저장
        for (int k = 0; k < size; k++) {
            int current = qu.peek(); // 다음 배포될 날짜
            if (current <= out) { // 기능이 처음에 꺼낸 날짜보다 빨리 끝날때
                count++; // 같이 배포할 기능 개수 증가
                qu.poll(); // 큐에서 삭제
                k--; // poll했으니 인덱스 유지
                size--; // 사이즈도 줄어듦
            } else { // 기능이 처음에 꺼낸 날짜보다 오래 걸릴 경우
                list.add(count); // 지금까지 같이 배포한 애들 저장
                out = qu.poll(); // 새 기준 설정
                count = 1; // 처음과 똑같이 새로 시작
                k--;
                size--;
            }
        }
        list.add(count); // 전체 배포 저장
        
        int[] answer = new int[list.size()]; // 리스트는 Integer 타입이기 때문에 배열로 바꿔주기
        for (int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j); // list에 있던 값들 불러오기
        }
        return answer;
    }
}