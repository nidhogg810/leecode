package leecode.c37;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private boolean[][] line = new boolean[9][9];
    private boolean[][] column = new boolean[9][9];
    private boolean[][][] block = new boolean[3][3][9];
    private boolean valid = false;
    private List<int[]> spaces = new ArrayList<int[]>();

    public void solveSudoku(char[][] board) {
        for(int i=0;i<board.length;++i){
            for(int j=0;j<board.length;++j){
                char c = board[i][j];
                int ci = c-'1';
                if(c>'0'&&c<='9'){
                    column[j][ci] = true;
                    line[i][ci] = true;
                    block[i/3][j/3][ci] = true;
                }else{
                    spaces.add(new int[]{i,j});
                }
            }
        }


    }
    public void dfs(int[] board,int beginPos){
        if(beginPos == spaces.size()){
            //如果推进到最后
            valid = true;
            return;
        }
        int[] space = spaces.get(beginPos);
        int i=space[0],j=space[1];
    }

}
