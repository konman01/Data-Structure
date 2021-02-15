class Solution {
    
    public int findMaxConsecutiveOnes(int[] nums) {
        
        // if the array is null or length == 0
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        int maxCount = 0;
        int count = 0;
        
        // loop through the array
        for(int i = 0; i < nums.length; i++){
            
            // if the number is equal to 1
            if(nums[i] == 1){
                
                // then increase the count
                count++;
                
                if((count > maxCount) && (i == nums.length - 1)){
                    return count;
                }
               
            }else{
               
                // if the count is greater then the Max Count, then Replace the  MaxCount
                if(count > maxCount){
                    
                    maxCount = count;
                }
                
                count = 0;
                
                
            }// end of if else
            
            
        }// end of for loop
        
        return maxCount;
        
        
    }
}