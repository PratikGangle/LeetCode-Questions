class Solution {
    static int dp[];
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target +1];
        Arrays.fill(dp,-1);
        return solve(nums,target);
    }
    
     public int solve(int[] nums, int target) {              
         if(target == 0){                 
             return 1;             
         }
         
         if(target < 0){                 
             return 0;         
         }
         if(dp[target] != -1){
             return dp[target];
         }
         
         int ans =0;
         
         for(int i=0; i<nums.length; i++){         
             ans += solve(nums,target-nums[i]);
             dp[target] = ans;
         }
         return dp[target];        
    }
}