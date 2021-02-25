//541. Reverse String II
class Solution {
    public String reverseStr(String s, int k) {
        
        // String is null || k is less than 1, then return s
        if(s == null || s.length() == 0 || k <=0){
            return s;
        }
        
        // Convert the String to Array
        char[] char_arr = s.toCharArray();
        
        for(int i = 0; i<char_arr.length; i = i + k * 2){
            
            int m = i;
            
            // get the minum of current index value upto which the substring is to be reversed or array length
            int n = Math.min(m+ k - 1, char_arr.length - 1);
            
            // Reverse String from index m to n
            while(m < n){
                
                char temp = char_arr[m];
                char_arr[m] = char_arr[n];
                char_arr[n] = temp;
                m++;
                n--;
            }// end of while
            
        }// end of loop
        
        // Convert the char array to String and Return
        return String.valueOf(char_arr);
        
        
        
    }// end of function
}