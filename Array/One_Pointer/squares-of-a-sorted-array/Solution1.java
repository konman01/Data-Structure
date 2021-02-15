class Solution {
    public int[] sortedSquares(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return null;
        }
        
        int[] arr = new int[nums.length];
        
        int i = 0;
        int j = nums.length -1;
        int k = nums.length - 1;
        
        // untill i < j
        while(i <= j){
            
            int square = 0;
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                square = nums[i];
                i++;
            }else{
                square = nums[j];
                j--;
            }
            
            //System.out.println(square);
            int val = square * square;
            arr[k] = val;
            k--;
            
            
        }// end of for loop
        
        return arr;
            
  
    }// end of function
    
}// end of class