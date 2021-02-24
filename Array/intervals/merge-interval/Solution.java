class Solution {
    public int[][] merge(int[][] intervals) {
        
        LinkedList<int[]> list = new LinkedList<>();
        
        // Sort the two dimentional Array
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
        
        
        for(int i=0; i<intervals.length; i++){
            
            // if the list is empty || last element in the list and having with index 1
            // is less than the 0th value of the array at the index i, then straightly 
            // add the element
            if(list.isEmpty() || (list.getLast()[1] < intervals[i][0])){
                list.add(intervals[i]);
            }else{
                
                list.getLast()[1] = Math.max(list.getLast()[1], intervals[i][1]);
            }
        }// end of for loop
        
        
        
        return list.toArray(new int[list.size()][]);
    }
}