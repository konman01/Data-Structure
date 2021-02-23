//75. Sort Colors


class Solution {
    public void sortColors(int[] nums) {
        
        
        // if the array is null, then return
        if(nums == null || nums.length == 0){
            return;
        }
        
        int curr = 0;
        int prev = 0;
        int next = nums.length - 1;
        
        
        while(curr <= next){
            
            // if the number at the index curr is 0, then replace the values at the index curr and pre
             if(nums[curr] == 0){
                 // increment index prev and curr
                int temp = nums[curr];
                nums[curr] = nums[prev];
                nums[prev] = temp;
                prev++;
                 curr++;
            }
            else if(nums[curr] == 2){
                // if the number at the index curr is 2, then replace the values at the index curr and next, then decrement the next index
                // do not increment the value at the index curr, since the value replaced night still be 2
                int temp = nums[curr];
                nums[curr] = nums[next];
                nums[next] = temp;
                next--;
                
            }else{
                // then value at the index curr is 1, then increment the curr
                curr++;
            }// end of if else
            
        }// end of for
        
        return;
        
    }// end of fucntion
}