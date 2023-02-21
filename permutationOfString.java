/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backtracking;

/**
 *
 * @author HP
 */
import java.util.ArrayList;

class Solution {
	public static void help(ArrayList<String> res,String str,String ans){
		if(str.length()==0){
			res.add(ans);
			return;
		}
		for(int i=0;i<str.length();i++){
			char curr=str.charAt(i);
			String newStr=str.substring(0,i)+str.substring(i+1);
			help(res,newStr,ans+curr);
		}
		
	}
	public static ArrayList<String> generatePermutations(String str) {
		// Write your code here
		ArrayList<String> res=new ArrayList<>();
		String ans="";
		help(res,str,ans);
		return res;
	}
}
public class permutationOfString {
    public static void main(String[]args){
        ArrayList<String> res=Solution.generatePermutations("DEBNIL");
        System.out.println(res);
    }
}
