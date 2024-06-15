package com.dsa.blind75.arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 	Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
	Example 1:
	
	Input: nums = [1,2,3,1]
	Output: true
	Example 2:
	
	Input: nums = [1,2,3,4]
	Output: false
	Example 3:
	
	Input: nums = [1,1,1,3,3,4,3,2,4,2]
	Output: true
	 
	
	Constraints:
	
	1 <= nums.length <= 105
	-109 <= nums[i] <= 109
 */
public class Duplicate {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> hashSet = new HashSet<>();
		for (Integer num : nums) {
			if (hashSet.contains(num)) {
				return true;
			}
			hashSet.add(num);
		}
		return false;
	}

	public static void main(String[] args) {
		LinkedHashSet<String> hashSet = new LinkedHashSet<>();
		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("three");
		hashSet.add("two");
		System.out.println("Set :: " + hashSet);
	}
}
