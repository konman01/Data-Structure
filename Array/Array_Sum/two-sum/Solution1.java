class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // if the array is null, then return null
        if(nums == null || nums.length == 0){
            return null;
        }

        for(int i = 0; i < nums.length; i++){
            
            for(int j = i+1; j < nums.length; j++){
                
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
                
                
            }// end of inner for loop
            
        }// end of outer for loop
        
        return null;
        
        
    }
}