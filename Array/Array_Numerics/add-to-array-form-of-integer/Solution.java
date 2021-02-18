class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        
        List<Integer> list = new ArrayList<>();
       
        int curr = K;
        int i = A.length - 1;
        
        while(i >= 0 || curr > 0){
            
            if(i >= 0){
                
                curr = curr + A[i];
            }
            
            int digit = curr % 10;
            list.add(digit);
            curr = curr / 10;
            i--;
            
            
        }
        
        Collections.reverse(list);
        return list;
        
    }
}