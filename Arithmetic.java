import java.util.*;
import java.io.*;


public class Arithmetic{

	/*
	-------------------------DESCRIPTION---------------------------
	Increment an integer whose digits are represented as array entries 
	*/

	public static List<Integer> plusOne(List<Integer> list){
		int m = list.size() - 1;
		list.set(m, list.get(m) + 1);
		for(int i = m; i > 0 && list.get(i) == 10; i--){
			list.set(i, 0);
			list.set(i - 1, list.get(i - 1) + 1); 
		} 
		if(list.get(0) == 10){
			list.set(0 , 0);
			list.add(0 , 1);
		}
		return list;
	}

	/*
	-------------------------SUMMARY---------------------------
	Time Complexity: O(n)
	Space Complexity: O(1)
	-------------------------INSIGHTS---------------------------
	 
	*/

	/*
	-------------------------DESCRIPTION---------------------------
	Sum two binary integers represented as strings 
	*/
	public static int[] stringBinarySum(String string1, String string2){
		int maxLen = 0;
		if(string1.length() < string2.length()){
			maxLen = string2.length();
		}else{
			maxLen = string1.length();
		}
		int[] sum = new int[maxLen + 1];
		

		for(int i = 0; i < string1.length(); i++){
			sum[maxLen - i - 1] = (int) string1.charAt(1); 
		}
		for(int i = 0; i < string2.length(); i++){
			sum[maxLen - i - 1] += (int) string2.charAt(1); 
		}
		for(int i = maxLen - 1; i > 0; i--){
			if(sum[i] == 2){
				sum[i] = 0;
				sum[i - 1] += 1;
			}else if(sum[i] == 3){
				sum[i] = 1;		
				sum[i - 1] += 1;
			}
		}
		for(int i = 0; i < maxLen; i++){
			sum[i]/= 48;
			sum[i]-= 1;
		}
		return sum;
	}
	/*
	-------------------------SUMMARY---------------------------
	Time Complexity: O(n)
	Space Complexity: O(1)
	-------------------------INSIGHTS---------------------------
	 
	*/




}