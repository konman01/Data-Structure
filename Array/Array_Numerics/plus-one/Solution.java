class Solution {
    public int[] plusOne(int[] digits) {
        
        // Definign Array to return
        int[] returnArr = new int[digits.length];
        
        //if the given array is null, return null
        if(digits == null || digits.length == 0){
            return returnArr;
        }
        
        // if the last digit of the array is less than 9, then add one to digit and return the array
        if(digits[digits.length - 1] < 9){
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            returnArr = digits;
            return returnArr;
        }
        
        int carry = 1;
        for(int i = digits.length-1; i >= 0; i--){
            
            int val = digits[i] + carry;
            
            
            if(val < 10){
                
                // increment the value at the index i and return the array
                digits[i] = digits[i] + 1;
                returnArr = digits;
                return returnArr;
                
            }else{
                // if the value at the index i is 10, then set the index with value 0, and carry = 1;
                digits[i] = 0;
                carry = 1;
            }
            
        }// end of for
        
        // the there is still 1 number to add to the array
        if(carry == 1){
            
            int[] temp  = new int[digits.length + 1];
            temp[0] = 1;
            for(int i = 0; i < digits.length; i++){
                
                temp[i+1] = digits[i];
                
            }// end of for
            returnArr = temp;
            
        }
        
        return returnArr;
        
    }// end of function
    
}// end of class