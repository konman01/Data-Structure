class Solution {
    public void rotate(int[] nums, int k) {
        
        // if the array is null, then just return
        if(nums == null || nums.length == 0){
            return;
        }
        
        // Define new Array with same length as nums
        int[] arr = new int[nums.length];
        
        int cnt = 0;
        
        // overcome multiple loop to rorate by 
        cnt = k % nums.length;
        
        int s = cnt;
        int i = 0;
        
        // untill i + s < nums array length
        // Shift to element to next cnt position
        while((i+s) < nums.length){
            arr[i+s] = nums[i];
            i++;
        }

        
        // Define last cnt element to the start of the array
        i = nums.length - cnt;
        int j = 0;
        while(i < arr.length){
            arr[j] = nums[i];
            i++;
            j++;
        }
        

        // define the element of arr to nums
        for(i = 0; i < nums.length ; i++){
            nums[i] = arr[i];
        }
        
        return;
        
    }
}