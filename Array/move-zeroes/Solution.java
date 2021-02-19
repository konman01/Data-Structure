class Solution {
    public void moveZeroes(int[] nums) {
        
        // if the nums is null
        if(nums == null){
            return;
        }
        
        int i = 0;
        int j = i + 1;
        
        while(j < nums.length){
            
            // if the nums[i] == 0
            if(nums[i] == 0){
                
                // if the nums[j] != 0;
                if(nums[j] != 0){
                    
                    // then swap the element between i and j
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                    j++;
                }// end of if
                else{
                    // just increment untill we get the next zero element
                    j++;
                }
                
            }else{
                i++;
                j++;
            }
            
        }// end of while
        
        return;
        
    }// end of function
    
}