package com.leetcode.array;

public class sortedSquares {

	public static void main(String[] args) {
		int a[] = {-7, -3, 2, 3, 11};
		int b[] = sortedSquares(a);
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
		
	}
	
	public static int[] sort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j ++ ) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	public static int[] sortedSquares(int[] A) {
		int[] b = new int[A.length];
		int[] c = new int[A.length];
		for(int i = 0; i < A.length; i++) {
			b[i] = A[i]*A[i];
		}
		c = sort(b);
		return b;
	}
}
