class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        if(nums == null || nums.length == 0){
            return list;
        }
        
        // Sort thr Array
        Arrays.sort(nums);
        
        for(int pre = 0; pre < nums.length - 3; pre++){
            
            for(int curr = pre + 1;curr < nums.length - 2; curr++){
                
                int start = curr + 1;
                int end = nums.length - 1;
                
                while(start < end){
                    
                    int sum = nums[pre] + nums [curr] + nums[start] + nums[end];
                    
                    if(sum < target){
                        start++;
                        
                    }else if(sum > target){
                        end--;
                    }else{
                        // sum is equal to targer
                        List<Integer> list1 = new ArrayList<Integer>();
                        
                        list1.add(nums[pre]);
                        list1.add(nums[curr]);
                        list1.add(nums[start]);
                        list1.add(nums[end]);
                        
                        list.add(list1);
                        
                        
                        // move the start index forward untill we get new value to form sum combination
                        while(start < end && nums[start] == nums[start+1]){
                            start++;
                        }
                        
                        // Move the index end backword untill we get new value to form sum combination
                        while(start < end && nums[end] == nums[end - 1]){
                            end--;
                        }
                        
                        start++;
                        end--;
                        
                    }// end of if else
                    
                    
                    
                }// end of while loop
                
                // Move the curr pointer untill we get new value to form sum combination
                while(curr < nums.length - 2 && nums[curr] == nums[curr+1]){
                    curr++;
                }
   
                
                
            }// end of inner for
            
            // Move the prev pointer untill we get new value to form sum combination
            while(pre < nums.length - 3 && nums[pre] == nums[pre+1]){
                pre++;
            }
            
        }// end of outer for
        
        return list;
        
    }
}