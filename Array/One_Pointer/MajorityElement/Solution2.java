class Solution {
    
    // Function defn
    public int majorityElement(int[] nums) {

        // if the array is null || array length is Zero
        if(nums == null || nums.length == 0){
            
            // then return -1
            return -1;
        }
        
        
        int i = 0;
        int j = 0;
        
        int returnVal = 0;
        int maxCnt = Integer.MIN_VALUE;
        int cnt = 0;
        Arrays.sort(nums);
        
        // loop through the array untill the index j is less than the Array length
        while( (j < nums.length)){
            
            // increment the count untill the value at the index i equals to index j
            if(nums[i] == nums[j]){
                
                // increase the count
                cnt++;

                // if the count is greater than max count and the index j value is equal to length of the array - 1
                if((cnt > maxCnt) && (j == nums.length - 1)){
                    
                    // then return the value at the index j
                    returnVal = nums[nums.length - 1];
                }
                
                j++;
                
            }else{
                
                // value at the index j != index i
                
                // if the count is greater than the Max count
                if(cnt > maxCnt){
                    
                    // then the value at the index i will be the return value
                    maxCnt = cnt;
                    returnVal = nums[i];
                    
                    
                }
                
                cnt = 0;
                i=j;
                
                
            }// end of if else
            
            
        }// end of while
        
        
        
        return returnVal;
        
    }// end of function
    
}// end of class