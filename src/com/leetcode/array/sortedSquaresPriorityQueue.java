package com.leetcode.array;

import java.util.PriorityQueue;

public class sortedSquaresPriorityQueue {
	public static void main(String[] args) {
		int[] array = {-7, -3, 2, 3, 11};
		int[] a = sortedSquaresPriorityQueue(array);
		for(int n : a) {
			System.out.println(n);
		}
	}
	
	public static int[] sortedSquaresPriorityQueue(int[] array) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		int[] b = new int[array.length];
		for(int n : array) {
			pQueue.add(n * n);
		}
		for(int i = 0; i < b.length; i++) {
			b[i] = pQueue.poll();
		}
		return b;
	}
}
/*
 * result
 * Runtime: 21s
 * Memory: 41.6 MB
 * */