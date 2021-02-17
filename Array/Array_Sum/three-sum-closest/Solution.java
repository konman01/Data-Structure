class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        // if the array is null || array length is zero, then return -1
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        
        int return_val = target;
        int min_diff = Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        
        for(int curr = 0; curr < nums.length - 1; curr++){
            
            int start = curr + 1;
            int end = nums.length - 1;
            
            while(start < end){
                
                int sum = nums[curr] + nums[start] + nums[end];
                
                // current difference
                int current_diff = Math.abs(target-sum);
                
                // if the sum is less than the closest
                if(current_diff < min_diff){
                    min_diff = current_diff;
                    return_val = sum;
                }
                // if Sum is greater than target
                if(sum < target){
                    start++;
                }else if(sum > target){
                    // Sum is less than the target
                    end--;
                }else{
                    // if sum == target
                    return target;
                }// end of if else
                
                
            }// end of while loop
            
            
            // move thge curr pointer untill we get the new value, to get rid of dupicate value
            while(curr < nums.length - 1 && nums[curr] == nums[curr+1]){
                curr++;
            }
            
            
        }// end of for loop
        
        return return_val;
        
        
    }
}