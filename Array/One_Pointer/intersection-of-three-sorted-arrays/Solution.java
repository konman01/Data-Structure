class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        
        // Define Array List to return
        ArrayList<Integer> list = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // if any of the 3 array is null, then return null
        if ((arr1 == null) || (arr2 == null) || (arr3 == null)){
            return list;
        }
        
        // loop through each of the array and store its occurance in HashMap
        for(int val: arr1){
            map.put(val,  (map.getOrDefault(val, 0)) + 1);
        }
        
        for(int val: arr2){
            map.put(val, (map.getOrDefault(val, 0)) + 1);
        }
        
        for(int val: arr3){
            map.put(val, (map.getOrDefault(val, 0)) + 1);
        }
        
        // Then loop through the HashMap and check if any int value has count 3
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            
            if(entry.getValue() == 3){
                list.add(entry.getKey());
            }
            
        }
        
        return list;
        
    }
}