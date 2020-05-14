package com.codeheist.practice.arrays;

import java.util.*;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        if(nums != null && nums.length>0) {
        	Map<Integer, Integer> indexMap = new HashMap<>();
        	for(int i=0; i<nums.length; i++) {
        		int diff = target - nums[i];
        		if(indexMap.containsKey(diff)) {
        			result[0] = i;
        			result[1] = indexMap.get(diff);
        			break;
        		}
        		indexMap.put(nums[i], i);
        	}
        }
        return result;
    }
	public static void main(String args[]) {
		TwoSum ts = new TwoSum();
		int nums[] = {2, 7, 11, 15}, target = 9;
		System.out.println(Arrays.toString(ts.twoSum(nums, target)));
	}
}
