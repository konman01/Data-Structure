class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] arr = new int[nums.length];
        
        // find the array product and number of zeroes in the array
        int totalProduct = 1;
        int totalZeros = 0;
        for(int val: nums){
            
            if(val == 0){
                totalZeros++;
                continue;
            }
            
            totalProduct = totalProduct * val;
        }// end of for loop
        
        
        // if the number of Zeros are grater than 1
        if(totalZeros > 1){
            // then set all the elements to Zero and return the array;
            for(int i = 0; i < arr.length; i++){
                arr[i] = 0;
            }
        }else if(totalZeros == 1){
            
            // if number of zeros in the array is 1
            // then set all the elemets whose value is not zero to zeros
            for(int i = 0; i < nums.length; i++){
                
                if(nums[i] != 0){
                    arr[i] = 0;
                }else{
                    
                    // value at index with value 0 to totalProduct
                    arr[i] = totalProduct;
                }
            }            
        }else{
            
            for(int i = 0; i < nums.length; i++){
                arr[i] = totalProduct/nums[i];
            }
            
        }// end of if else
        
        return arr;
        
        
    }
}