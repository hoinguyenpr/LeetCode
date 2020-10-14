package com.leetcode.array;

public class duplicateZeros_v2 {
	public static void main(String[] args) {
		int a[] = {1,0,2,3,0,4,5,0};
		duplicateZeros(a);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	public static void duplicateZeros(int[] arr) {
if (arr == null || arr.length <= 0) return;
        
        int[] temp = new int[arr.length];
        
        for (int i=0;i<arr.length;i++) {
            temp[i]=arr[i];
        }
        
        int i=0;
        int j=0;
        
        while (j<arr.length) {
            if (temp[i] == 0){
                arr[j++] = 0;
                if (j<arr.length) {
                   arr[j++]=0; 
                }
                i++;
            } else arr[j++] = temp[i++];
        }
	}
}

/*Author: Fellow
 * result
 * Runtime: 1s
 * Memory: 
 * */