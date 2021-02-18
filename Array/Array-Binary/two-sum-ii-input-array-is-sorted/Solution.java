class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if(nums == null || nums.length == 0){
            return null;
        }
        
        int i = 0;
        int j = nums.length - 1;
        
        while(i < j){
            
            int sum = nums[i] + nums[j];
            
            if(sum < target){
                i++;
            }else if(sum > target){
                j--;
            }else{
                // sum is equal to target
                return new int[]{i+1, j+1};
            }
            
        }// end of while
        
        return null;
        
    }// end of function 
}