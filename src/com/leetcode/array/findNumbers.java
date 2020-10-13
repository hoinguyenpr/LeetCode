package com.leetcode.array;

public class findNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12, 345, 2, 6, 7896};
		System.out.println(findNumbers(array));
	}
	
	public static boolean isEvenNumber(int a) {
		int count = 0;
		do {
			a = a / 10;
			count ++;
		}while(a > 0);
		
		return count % 2 == 0 ? true : false;
	}
	
	public static int findNumbers(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i ++) {
			if(isEvenNumber(nums[i]) == false) {
				continue;
			}else {
				count ++;
			}
		}
		return count;
	}
}
