class Solution {
    
    public List<Integer> findDuplicates(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // loop through the array
        for(int val: nums){
            
            // if the element is present in the set alredy
            if(set.contains(val)){
                
                // then add the value to set
                list.add(val);
                continue;
            }
            
            
            set.add(val);
            
            
        }// end of for loop
        
        return list;
        
    }// end of funtion
    
}// End of Solution