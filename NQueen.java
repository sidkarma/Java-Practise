import java.util.*;
// N-Queens
public class NQueen {
    public void helper(char board,list<list<String>> allBoards, int col) {
        for(int row=0;row<board.length;row++) {
            if(isSafe(row,col,board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
            }
        }
    }
     public list<list<String>> solveNQueens(int n) {
        list<list<String>> allBoards = new ArrayList<>();
        char[][] board= new board[n][n];
        helper(board, allBoards, 0);
     }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close(); 
    }
}
