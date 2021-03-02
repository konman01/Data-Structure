package com.konman01.array;

public class SlidingWindow {
	
	
	public int maxSum(int[] nums, int n) {
		
		
		if(nums == null || nums.length == 0 || n <= 0) {
			return 0;
		}
		
		int windowSum = 0;
		
		// First get the window sum
		for(int i = 0; i<n; i++) {
			windowSum = windowSum + nums[i];
		}
		
		// loop through the remaining window and get the Max Sum
		for(int i = n; i <nums.length; i++) {
			
			int sum = windowSum - nums[i - n] + nums[i];
			
			windowSum = Math.max(windowSum, sum);
		}

		return windowSum;
	}

}
