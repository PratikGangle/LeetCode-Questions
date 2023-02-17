class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int size = nums.length;
        
        int [] ans = new int[size];
        
        ans[0] = 1;
               
        for(int i=1 ; i<nums.length;  i++){            
            ans[i] = nums[i-1] * ans[i-1];
        }
                
        int suffix =1;
        for(int i=size-1; i>=0; i--){
            ans[i]  *= suffix;
            suffix *=  nums[i];             
        }
        
        return ans;                    
              
    }
}