package com.leetcode.array;

public class duplicateZeros_v1_op {
	public static void main(String[] args) {
		int a[] = {1,5,2,0,6,8,0,6,0};
		duplicateZeros(a);
		for(int i = 0; i < a.length; i++) {
			System.out.print( a[i]);
		}
	}
	
	public static void duplicateZeros(int[] a) {
		
		int temp[] = new int[a.length];
		
		
		for(int i = 0, j = 0; j < a.length ;i++, j++) {
			if(a[i] == 0) {
				temp[j] = 0;
				if(j < a.length - 1) {
					temp[j + 1] = 0; 
					j ++;
				}
			}else { 
				temp[j] = a[i];
			}
		}
		a = temp;
 	}
}
/*Author: Hoi Nguyen
 * result
 * Runtime: 1s
 * Memory: 39.2MB
 * */