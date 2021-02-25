class Solution {
    public String reverseVowels(String s) {
        
        // If the string is null, then return null
        if(s == null || s.length() == 0){
            return s;
        }
        
        // Convert the String to Array
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length - 1;
        
        while(i < j){
            
            // if the character is not an vowel
            if((charArray[i] != 'a') && (charArray[i] != 'e') && (charArray[i] != 'i') && (charArray[i] != 'o') && (charArray[i] != 'u') && (charArray[i] != 'A') && (charArray[i] != 'E') && (charArray[i] != 'I') && (charArray[i] != 'U') && (charArray[i] != 'O')){
                // move to next character at index i
                i++;
                continue;
            }
            
            // if the character is not a vowel
            if((charArray[j] != 'a') && (charArray[j] != 'e') && (charArray[j] != 'i') && (charArray[j] != 'o' && (charArray[j] != 'A') && (charArray[j] != 'E') && (charArray[j] != 'I') && (charArray[j] != 'U') && (charArray[j] != 'O')) && (charArray[j] != 'u')){
                // move to next character at index j
                j--;
                continue;
            }
            
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            
            
            i++;
            j--;
        }// end of while
        
        return String.valueOf(charArray);
        
    }
}