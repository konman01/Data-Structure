// 917. Reverse Only Letters
class Solution {
    public String reverseOnlyLetters(String S) {
        
        // if the String is null, return null;
        if(S == null || S.length() == 0){
            return S;
        }
        
        // Convert the String to Character Array
        char[] charArr = S.toCharArray();
        int i = 0;
        int j = charArr.length - 1;
        
        while(i < j){
            
            // if the chacter at the index is not digit or Alphabetic Character
            if(!Character.isLetter(charArr[i])){
                i++;
                continue;
            }
            
            if(!Character.isLetter(charArr[j])){
                j--;
                 continue;
            }
            
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
            i++;
            j--;
            
            //System.out.println(String.valueOf(charArr));
            
            
        }// end of while
        
        return String.valueOf(charArr);
        
    }
}
//"ab-cd"
//"7_28]"