class Solution {
    
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//printArray();
		
		
		// loop through the array and store it in Map
		for(int value: nums) {
			
			// if the element is already present in the hashmap, then increate its count
			if(map.containsKey(value)) {
				
				int cnt = map.get(value);
				cnt++;
				map.put(value, cnt);
			}else {
				map.put(value, 1);
			}
		}
        
        // set the Max Count and return_val to Minimum Value
		int max_cnt = Integer.MIN_VALUE;
		int return_val = Integer.MIN_VALUE;
		
		// Loop through each entry set of the hash map created to get value having max count
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			
			int key = entry.getKey();
			int val = entry.getValue();
			
			// if the value is greater than the max count
			if(val > max_cnt) {
				
				// then return value is the key
				return_val = key;
				
				// and set this count to Max Count
				max_cnt = val;
				
			}// end of if
			
			
		}// end of for loop
		
		
		//printArray();
		
		
		return return_val;
        
        
        
    }// end of function
    
}// end of class