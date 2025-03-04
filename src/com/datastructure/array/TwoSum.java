package com.datastructure.array;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = selfTwoSum(nums, 9);
        System.out.println("[" + result[0] + "," + result[1] +  "]");
    }

    public static int[] selfTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i ++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static int[] mapTwoSum(int[] nums, int target) {
        return null;
    }

    public static int[] revertTwoSum(int[] nums, int target) {
        return null;
    }

    public static int[] chatGPTTwoSum(int[] nums, int target) {
        return null;
    }
    
}

