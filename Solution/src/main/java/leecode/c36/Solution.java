package leecode.c36;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] x = new int[board.length][10];
        int[][] y = new int[board[0].length][10];
        int[][][] sub = new int[3][3][10];
        for(int i=0;i<board.length;++i){
            for(int j=0;j<board[i].length;++j){
                char c = board[i][j];
                if('.'==c){
                    break;
                }
                int ci = (int) (c-'1');
                x[i][ci] = x[i][ci]+1;
                y[j][ci] = y[j][ci]+1;
                sub[i/3][j/3][ci] = sub[i/3][j/3][ci]+1;
                if(x[i][ci]>1||y[j][ci]>1||sub[i/3][j/3][ci]>1){
                    return false;
                }
            }
        }
        return true;
    }
}
