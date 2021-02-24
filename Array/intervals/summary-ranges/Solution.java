class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list = new ArrayList<>();
        
        // if the array is null, then return null
        if(nums == null || nums.length == 0){
            return list;
        }
        
        int j = 0;
        for(int i = 0; i< nums.length; i++){
            
            if(i+1 < nums.length && nums[i]+1 == nums[i+1] ){
                continue;
            }
            
            // if the index i is same as lj
            if(i == j){
                // then the numbers are not in sequence
                list.add(""+nums[i]);
            }else{
                list.add(""+nums[j]+"->"+nums[i]);
            }
            j = i + 1;
            
            
        }
        
        return list;
        
    }
}