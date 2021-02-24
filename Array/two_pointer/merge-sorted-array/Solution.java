// 88. Merge Sorted Array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        // Considering the fact that the two arrays will not be null
        int i = m+n-1;
        int j = m - 1;
        int k = n - 1;
        
        //loop through the nums1 and nums2 untill the i>=0
        while(i >= 0){
            
            
            if(k < 0 || j >=0 && (nums1[j] > nums2[k])){
                nums1[i] = nums1[j];
                j--;
            }else{
                nums1[i] = nums2[k];
                k--;
            }
            i--;
        }// end of while
        
        return;
        
    }// end of fucntion
    
    
    
}