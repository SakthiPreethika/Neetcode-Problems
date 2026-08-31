class Solution {
    public int maxSubArray(int[] nums) {
        int val=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(val+nums[i]>nums[i]){
                val+=nums[i];
            }
            else{
                val=nums[i];
            }
            if(val>max){
                max=val;
            }
        }
        return max;
        
    }
}
