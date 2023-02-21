/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backtracking;

/**
 *
 * @author HP
 */
class SodukoSolver {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    public boolean solve(char[][] board,int row,int col){
        if(row==9)
            return true;
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(board[row][col]!='.')
           return solve(board,nextRow,nextCol);
        
        for(char i=49;i<=57;i++){
            if(isSafe(board,i,row,col)){
                board[row][col]=i;
                if(solve(board,nextRow,nextCol))
                    return true;
                board[row][col]='.';
                }
            }
            return false;
    }
    public boolean isSafe(char[][] board,char digit,int row,int col){
        for(int i=0;i<9;i++){
            if(board[row][i]==digit)
                return false;
        }
        for(int i=0;i<9;i++){
            if(board[i][col]==digit)
                return false;
        }

        int gridRow=(row/3)*3;
        int gridCol=(col/3)*3;
        for(int i=gridRow;i<gridRow+3;i++){
            for(int j=gridCol;j<gridCol+3;j++){
                if(board[i][j]==digit)
                    return false;
            }
        }

        return true;
    }
}

