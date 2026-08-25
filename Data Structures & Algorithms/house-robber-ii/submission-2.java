class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
         if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int dp[]=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n-1;i++){
           
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            
        }
        int first= dp[n-2];
        int[] dp2=new int[n];
        dp2[1]=nums[1];
        dp2[2]=Math.max(nums[1],nums[2]);
        for(int i=3;i<n;i++){
            dp2[i]=Math.max(dp2[i-1],dp2[i-2]+nums[i]);
        }
        int second=dp2[n-1];
        return Math.max(first,second);
        
    }
}
