class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        // Define Arraylist to return
        ArrayList<Integer> list = new ArrayList<>();
        
        // if the array is null, then return
        if(nums == null || nums.length == 0){
            return list;
        }
        
        // there will be posiibality that only 2 numbers in an array will have greater count compared to other
        Integer num1 = null;
        Integer num2 = null;
        int count1 = 0;
        int count2 = 0;
        
        // get the first 2 number which are repeated more in array
        for(int val: nums){
            
            if((num1 != null) && (num1 == val)){
                count1++;   
            }else if((num2 != null) && (num2 == val)){
                count2++;
            }else if(count1 == 0){
                num1 = val;
                count1++;
            }else if(count2 == 0){
                num2 = val;
                count2++;
            }else{
                count1--;
                count2--;
            }// end of if else
            
            
        }// end of for loop
        
        count1 = 0;
        count2 = 0;
        
        // then count of the two number in the array
        for(int val: nums){
            
            // if the val is equal to num1, then increment count1
            if(num1 != null && val == num1){
                count1++;
            }
            
            // if the value is equal to num2, then increment count2
            if(num2 != null && val == num2){
                count2++;
            }
            
        }// end of for
        
        // if the count of the num1 is greater than n/3, then its one of majority
        if(count1 > (nums.length/3)){
            list.add(num1);
        }
        
        // if the count of the num1 is greater than n/3, then its one of majority
        if(count2 > (nums.length/3)){
            list.add(num2);
        }
        
        return list;
    
        
        
    }
}