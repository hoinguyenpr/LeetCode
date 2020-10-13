package com.leetcode.array;

public class findMaxConsecutiveOnes {
	

	
	public static void main(String[] args) {
		int[] array = {1,1,0,1,1,1,0,0,0,1};
		System.out.println(findMaxConsecutive(array));
	}
	public static int max(int a, int b) {
		if(a > b) return a;
		else return b;
	}
	public static int findMaxConsecutive(int [] nums) {
		int count = 0;
		int max = 0;
		
		if(nums.length == 0 ) return 0;
		else {
			for(int i = 0; i < nums.length; i ++) {
				if(nums[i] == 0) count = 0;
				else {
					count ++;
				}
				max = max(count, max);
			}
		}
		return max;
	}
}
