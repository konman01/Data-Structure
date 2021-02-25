class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        
        
        // List to return
        List<String> list = new ArrayList<>();
        
        if(nums == null || nums.length == 0){
            
            if(lower == upper){
                list.add(""+lower);
            }else{
                String val = "";
                val = ""+lower+"->"+upper;
                list.add(val);
            }
            return list;
            
        }
        
        if(lower != nums[0]){
            
            if((lower + 1) == nums[0]){
                list.add(""+lower);
            }else{
                String val = "";
                val = val + lower + "->" + (nums[0] - 1);
                list.add(val);
            }
        }
        
        
        
        for(int i=0; i<nums.length - 1; i++){
             
            // if the value at the index i + 1 is equal to value at index (i + 1)
            if(i+1 < nums.length && (nums[i] + 1 == nums[i+1])){
                continue;
            }
            
            // if the value at index i + 1 is equal to value at index (i+1) - 1
            if((nums[i] + 1) == (nums[i+1] - 1)){
                String val = "";
                val = val + (nums[i]+1);
                list.add(val);
            }else{
                // Define the range of the missing numbers
                String val = "";
                val = ""+(nums[i]+1)+"->"+(nums[i+1] - 1);
                list.add(val);
            }// end of if else
            
        }// end of for loop
        
        // if the upper is not equal to last index value in the array
        if(nums[nums.length - 1] != upper){
            
            if((nums[nums.length - 1] + 1) == upper){
                list.add(""+upper);
            }else{
                String val = "";
                val = ""+((nums[nums.length - 1]) + 1 ) +"->"+upper;
                list.add(val);
            }
            
        }
        
        return list;
        
        
    }
}