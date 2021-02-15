class Solution {
    public int missingNumber(int[] nums) {
        
        // if the array is null, then return -1
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        
        // Then sort the array
        Arrays.sort(nums);
        
        // Check the first element whether it is zero or not
        if(nums[0] != 0){
            return 0;
        }
        
        // if the last element of the array is not equal to nums.length
        if(nums[nums.length - 1] != nums.length){
            // then return nums.length
            return nums.length;
        }
        
        // loop through the array from 0 to n and check whether the number at index i is 1 less than to number at index i+1 
        for(int i = 1; i < nums.length; i++){
            
            if(nums[i-1] != nums[i] - 1){
                return nums[i-1]+1;
            }
            
        }
        
        return -1;
        
        
        
    }
}