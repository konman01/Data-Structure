class Solution {
    
    public int findDuplicate(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        for(int i = 0; i< nums.length; i++){
            
            for(int j = i + 1; j < nums.length; j++){
                
                // if the index i == j
                if(i == j){
                    // then continue at the index j
                    continue;
                }
                
                if(nums[i] == nums[j]){
                    return nums[i];
                    
                }// end of if
                
            }// end of inner for
            
            
        }// end of outer for
        
        return -1;
        
    }// end of function
    
}