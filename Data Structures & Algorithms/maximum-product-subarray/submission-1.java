class Solution {
    public int maxProduct(int[] nums) {
        int val=nums[0];
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){

           if(nums[i]<0){
            int temp=val;
            val=min;
            min=temp;
           }
           val=Math.max(nums[i],nums[i]*val);
           min=Math.min(nums[i],nums[i]*min);
           max=Math.max(val,max);
        }
        return max;
        
    }
}
