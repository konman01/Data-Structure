class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        
        // Define Array List to return
        ArrayList<Integer> list = new ArrayList<>();
        
        // if any of the array is null, then return null
        if(arr1 == null || arr2 == null || arr3 == null){
            return list;
        }
        
        // index for arr1, arr2 and arr3
        int i=0, j=0, k=0;
        
        // loop through the array untill index is greater than any array length
        while(i < arr1.length && j < arr2.length && k < arr3.length){
            
            // if the element at the index i, j and k are same
            if((arr1[i] == arr2[j]) && ((arr2[j] == arr3[k])) ){
                
                // Then add the element to list
                list.add(arr1[i]);
                i++;
                j++;
                k++;
            }else{
                
                if(arr1[i] < arr2[j]){
                    i++;
                }else if(arr2[j] < arr3[k]){
                    j++;
                }else{
                    k++;
                }
            }// end of if else
            
            
        }// end of while loop
        
        return list;
    }
}