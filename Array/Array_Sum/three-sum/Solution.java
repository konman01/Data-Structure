class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        // if the array is null, return null
        if(nums == null || nums.length == 0){
            return list;
        }
        
        
        // Sort the given Array
        Arrays.sort(nums);
        
        for(int curr = 0; curr < nums.length - 2; curr++){
            
            // Define other two pointers to get the sum of 3 element in an array
            int start = curr + 1;
            int end = nums.length - 1;
            
            while(start < end){
                
                int sum = nums[curr] + nums[start] + nums[end];
                
                // if sum is less than zero
                if(sum < 0){
                    start++;

                }else if(sum > 0){
                    // sum is greater than Zero
                    end--;
                }else{
                    // Sum is equal to Zero
                    
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(nums[curr]);
                    list1.add(nums[start]);
                    list1.add(nums[end]);
                    
                    list.add(list1);
                    
                    // Move the pointer Start untill we get new value to form an combination
                    while(start < end && nums[start] == nums[start + 1]){
                        start++;
                    }
                    
                    // Move the pointer End backwords untill we get new value to form a combination
                    while(start < end && nums[end] == nums[end - 1]){
                        end--;
                    }
                    
                    start++;
                    end--;
                    
                }// end of if else
                
                
                
                
            }// end of while
            
            // move the curr pointer untill we get new value to form a combination
            while(curr < nums.length - 1 && nums[curr] == nums[curr + 1]){
                curr++;
            }// end of while
            
            
        }// end of for loop
        
        return list;
        
    }// end of function
}