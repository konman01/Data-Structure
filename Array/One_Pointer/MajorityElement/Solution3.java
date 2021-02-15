class Solution {
    public int majorityElement(int[] nums) {
        
        // Sort the array
        Arrays.sort(nums);
        
        // The number having the max count will be always greater than the number n/2 in count
        
        // so return the number at the index n/2
        return nums[nums.length / 2];
        
    }
}