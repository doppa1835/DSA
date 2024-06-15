package com.dsa.blind75.arrays;

/*
	 Given an integer array nums, find a sub array that has the largest product, and return the product.
	
	The test cases are generated so that the answer will fit in a 32-bit integer.
	
	Example 1:
	
	Input: nums = [2,3,-2,4]
	Output: 6
	Explanation: [2,3] has the largest product 6.
	Example 2:
	
	Input: nums = [-2,0,-1]
	Output: 0
	Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
	 
	Constraints:
	
	1 <= nums.length <= 2 * 104
	-10 <= nums[i] <= 10
	The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
		int prefix = 1;
		int suffix = 1;
		int maxi = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (prefix == 0) {
				prefix = 1;
			}
			if (suffix == 0) {
				suffix = 1;
			}
			prefix = prefix * nums[i];
			suffix = suffix * nums[nums.length - i - 1];
			maxi = Math.max(maxi, Math.max(prefix, suffix));
		}
		return maxi;
	}
}
