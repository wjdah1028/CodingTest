import java.util.ArrayDeque;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        ArrayDeque<Integer> basket = new ArrayDeque<>();
        int count = 0;
        
        for (int move: moves) {
            int col = move - 1; // moves 배열은 1부터 시작하기 때문에 0으로 맞춰줌
            
            // move -> 크레인이 내려가는 해당 위치에 인형이 있는지 확인
            for (int row = 0; row < board.length; row++) {
                
                // 인형이 있는지 검증
                if (board[row][col] != 0) {
                    int doll = board[row][col];
                    board[row][col] = 0;
                    
                    // 뽑은 인형을 basket으로 이동
                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        count += 2;
                    }
                    else {
                        basket.push(doll);
                    }
                    break;
                }
            }
        }
        
        return count;
    }
}
