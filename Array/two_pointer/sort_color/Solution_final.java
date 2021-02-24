//75. Sort Colors
class Solution {
    public void sortColors(int[] nums) {
        
        if(nums == null){
            return;
        }
        
        int p0 = 0;
        int p2 = nums.length - 1;
        int curr = 0;
        
        while(curr <= p2){
            
            // if the number at the index curr is 0, then replace the values between the index p0
            // and curr
            if(nums[curr] == 0){
                int temp = nums[curr];
                nums[curr] = nums[p0];
                nums[p0] = temp;
                p0++;
                curr++;
            }else if(nums[curr] == 2){
                // else replace the values between p2 and curr
                int temp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2] = temp;
                p2--;
                
            }else{
                curr++;
            }
            
            
            
        }
        
        return;
        
    }
}