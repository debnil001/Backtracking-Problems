/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backtracking;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
  class RatinMaze {
    int rowMoves[]=new int[]{-1,0,0,1};
    int colMoves[]=new int[]{0,-1,1,0};
    public static void rim(int[][]m,int n,ArrayList<String> res,
    int row,int col,boolean vis[][],String path){
            if(row==n-1 && col==n-1){
                res.add(path);
                return;
            }
            if(row+1<n && !vis[row+1][col] && m[row+1][col]==1){
                vis[row][col]=true;
                rim(m,n,res,row+1,col,vis,path+"D");
                vis[row][col]=false;
            }
            if(col-1>=0 && !vis[row][col-1] && m[row][col-1]==1){
                vis[row][col]=true;
                rim(m,n,res,row,col-1,vis,path+"L");
                vis[row][col]=false;
            }
            if(col+1<n && !vis[row][col+1] && m[row][col+1]==1){
                vis[row][col]=true;
                rim(m,n,res,row,col+1,vis,path+"R");
                vis[row][col]=false;
            }
            if(row-1>=0 && !vis[row-1][col] && m[row-1][col]==1){
                vis[row][col]=true;
                rim(m,n,res,row-1,col,vis,path+"U");
                vis[row][col]=false;
            }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> res=new ArrayList<>();
        if(m[0][0]==0)
            return res;
        boolean vis[][]=new boolean[n][n];
        rim(m,n,res,0,0,vis,"");
        return res;
    }
}