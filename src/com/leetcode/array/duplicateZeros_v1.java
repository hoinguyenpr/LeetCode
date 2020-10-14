package com.leetcode.array;

public class duplicateZeros_v1 {
	public static void main(String[] args) {
		int a[] = {1,1,0};
		duplicateZeros(a);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void insertArray(int[] array, int a, int index) {
		for(int i = array.length - 1; i > index; i --) {
			array[i] = array[i - 1];
		}
		array[index] = a;
	}
	
	public static void duplicateZeros(int[] a) {
		boolean flag = false;
		for(int i = 0; i < a.length - 1; i ++) {
			if(flag == true) {
				flag = false;
				continue;
			}
			if(a[i] == 0) {
				flag = true;
				insertArray(a, 0, i + 1);
			}
		}
	}
}
/*Author: Hoi Nguyen
 * result
 * Runtime: 14s
 * Memory: 38.8MB
 * */