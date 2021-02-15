class Solution {
    public int missingNumber(int[] nums) {
        
        // Define an HashSet to store the number
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++){
            
            set.add(nums[i]);
        }// end of for loop
        
        // Now check whether the number from 0 to n are present in the hashet
        int i = 0;
        while(i <= nums.length){
            
            // if the number i is not present in the set, then return it
            if(!set.contains(i)){
                return i;
            }// end of if
            i++;
            
        }// end of while loop
        
        return -1;
        
    }
}