import java.util.*;

class Main2019_Internship_1 {
    static Stack<Integer> store = new Stack<>();
    static int result = 0;

    public static void main(String[] args) {

        System.out.println(solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}},
        new int[]{1,5,3,5,1,2,1,4}));
        // 4

    }

    public static int solution(int[][] board, int[] moves) {
        for(int i=0; i<moves.length; i++) {
            
            for(int j=0; j<board.length; j++) {
                if (board[j][moves[i]-1] != 0) { // 블록을 발견한다면
                    if (!store.isEmpty() && store.peek() == board[j][moves[i]-1]) {
                        store.pop();
                        result += 2;
                    } else store.push(board[j][moves[i]-1]);

                    board[j][moves[i]-1] = 0;
                    break;
                }
            }

        }

        return result;
    }

}