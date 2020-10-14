package com.leetcode.array;

public class duplicateZeros_v3 {
	public static void main(String[] args) {
		int a[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
		duplicateZeros(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static int setValueAtIndexAndDecrement(int[] arr, int index, int value) {
		if (index < arr.length && index >= 0) {
			arr[index] = value;
		}
		return index - 1;
	}

	private static int countOfElement(int[] arr, int element) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
			}
		}
		return count;
	}

	public static void duplicateZeros(int[] arr) {

		int countOfZeros = countOfElement(arr, 0);

		int newIndex = arr.length + countOfZeros - 1;

		for (int index = arr.length - 1; newIndex != index; index--) {
			if (arr[index] != 0) {
				newIndex = setValueAtIndexAndDecrement(arr, newIndex, arr[index]);
			} else {
				newIndex = setValueAtIndexAndDecrement(arr, newIndex, 0);
				newIndex = setValueAtIndexAndDecrement(arr, newIndex, 0);
			}
		}
	}
}

/*
 * Author: Fellow result Runtime: 2s Memory:
 */
