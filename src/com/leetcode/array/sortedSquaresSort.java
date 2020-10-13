package com.leetcode.array;

import java.util.Arrays;
import java.util.Collections;

public class sortedSquaresSort {
	public static void main(String[] args) {
		int[] array = {-7, -3, 2, 3, 11};
		int b[] = sortedSquares(array);
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
	}
	
	public static int[] sortedSquares(int[] array) {
		int[] b = new int[array.length];
		for(int i = 0; i < array.length; i ++) {
			b[i] = array[i] * array[i];
		}
		Arrays.parallelSort(b);
		return b;
	}
	
}
/*
 * result
 * Runtime: 5s
 * Memory: 41MB
 * */