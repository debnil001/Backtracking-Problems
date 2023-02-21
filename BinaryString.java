/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backtracking;

public class BinaryString {
    public static void findBinaryString(int length,int count,int lastPlace,String res){
        if(length==0){
            System.out.println(res);
            return;
        }
        if(count==0||count==2){
            if(count==2)
                count=0;
            findBinaryString(length-1,count+1,0,res+"0");
            findBinaryString(length-1,count+1,1,res+"1");
        }
        else if(count<2){
             if(lastPlace==1)
                 findBinaryString(length-1,count+1,0,res+"0");
              else
                 findBinaryString(length-1,count+1,1,res+"1");
        }
    }
    public static void main(String[]ars){
        findBinaryString(5,0,0,"");
    }
}
