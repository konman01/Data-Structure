class Solution {
    public int findDuplicate(int[] nums) {
        
        // If the array is null or there is no element in the array
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        // set all the element in the array
        for(int val: nums){
            
            // if the number is already present in the set
            if(set.contains(val)){
                return val;
            }
            
            set.add(val);
        }
        
        return -1;
        
    }
}